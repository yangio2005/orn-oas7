-- NRO Game Server - MySQL Schema
-- Database: mobi
-- Purpose: Store critical relational data (accounts, transactions, metadata)

-- Create database
CREATE DATABASE IF NOT EXISTS mobi CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE mobi;

-- ============================================
-- Table: account
-- Purpose: User accounts and authentication
-- ============================================
CREATE TABLE IF NOT EXISTS account (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100),
    phone VARCHAR(20),
    
    -- Account status
    ban BOOLEAN DEFAULT FALSE,
    ban_reason TEXT,
    ban_until DATETIME,
    
    -- Admin/VIP status
    is_admin BOOLEAN DEFAULT FALSE,
    vip_level INT DEFAULT 0,
    vip_expire DATETIME,
    
    -- Security
    last_ip VARCHAR(45),
    last_time_login DATETIME,
    
    -- Timestamps
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    
    INDEX idx_username (username),
    INDEX idx_email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ============================================
-- Table: player
-- Purpose: Player metadata (basic info only)
-- Note: Game data (stats, inventory) stored in MongoDB
-- ============================================
CREATE TABLE IF NOT EXISTS player (
    id INT AUTO_INCREMENT PRIMARY KEY,
    account_id INT NOT NULL,
    
    -- Basic info
    name VARCHAR(50) NOT NULL UNIQUE,
    gender TINYINT NOT NULL DEFAULT 0, -- 0: Male, 1: Female, 2: Namek
    head SMALLINT NOT NULL DEFAULT -1,
    body SMALLINT DEFAULT -1,
    leg SMALLINT DEFAULT -1,
    role TINYINT DEFAULT 0, -- Class/Role
    
    -- Timestamps
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    
    FOREIGN KEY (account_id) REFERENCES account(id) ON DELETE CASCADE,
    INDEX idx_account (account_id),
    INDEX idx_name (name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ============================================
-- Table: transaction
-- Purpose: Payment and transaction history
-- ============================================
CREATE TABLE IF NOT EXISTS transaction (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    account_id INT NOT NULL,
    
    -- Transaction details
    type ENUM('DEPOSIT', 'WITHDRAW', 'PURCHASE', 'REWARD', 'REFUND') NOT NULL,
    amount DECIMAL(15, 2) NOT NULL,
    currency VARCHAR(10) DEFAULT 'VND',
    
    -- Payment info
    payment_method VARCHAR(50),
    transaction_code VARCHAR(100) UNIQUE,
    status ENUM('PENDING', 'SUCCESS', 'FAILED', 'CANCELLED') DEFAULT 'PENDING',
    
    -- Description
    description TEXT,
    metadata JSON,
    
    -- Timestamps
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    completed_at TIMESTAMP NULL,
    
    FOREIGN KEY (account_id) REFERENCES account(id) ON DELETE CASCADE,
    INDEX idx_account (account_id),
    INDEX idx_status (status),
    INDEX idx_created (created_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ============================================
-- Table: audit_log
-- Purpose: System audit trail
-- ============================================
CREATE TABLE IF NOT EXISTS audit_log (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    
    -- Actor
    account_id INT,
    player_id INT,
    admin_id INT,
    
    -- Action
    action VARCHAR(100) NOT NULL,
    entity_type VARCHAR(50),
    entity_id VARCHAR(100),
    
    -- Details
    old_value JSON,
    new_value JSON,
    ip_address VARCHAR(45),
    user_agent TEXT,
    
    -- Timestamp
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    
    INDEX idx_account (account_id),
    INDEX idx_action (action),
    INDEX idx_created (created_at)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ============================================
-- Insert sample data
-- ============================================

-- Sample admin account
INSERT INTO account (username, password, email, is_admin, vip_level) 
VALUES 
    ('admin', 'admin123', 'admin@nro.game', TRUE, 10),
    ('testuser', 'test123', 'test@nro.game', FALSE, 0)
ON DUPLICATE KEY UPDATE username=username;

-- Sample player for testuser
INSERT INTO player (account_id, name, gender, head, body, leg, role)
SELECT id, 'TestPlayer', 0, 1, 1, 1, 0
FROM account WHERE username = 'testuser'
ON DUPLICATE KEY UPDATE name=name;

-- Sample transaction
INSERT INTO transaction (account_id, type, amount, payment_method, transaction_code, status, description)
SELECT id, 'DEPOSIT', 100000, 'BANK_TRANSFER', 'TXN001', 'SUCCESS', 'Initial deposit'
FROM account WHERE username = 'testuser'
ON DUPLICATE KEY UPDATE transaction_code=transaction_code;

-- ============================================
-- Views for common queries
-- ============================================

-- View: Active players with account info
CREATE OR REPLACE VIEW v_active_players AS
SELECT 
    p.id as player_id,
    p.name as player_name,
    p.gender,
    p.role,
    a.id as account_id,
    a.username,
    a.email,
    a.vip_level,
    a.is_admin,
    a.ban,
    a.last_time_login,
    p.created_at as player_created
FROM player p
JOIN account a ON p.account_id = a.id
WHERE a.ban = FALSE;

-- View: Transaction summary by account
CREATE OR REPLACE VIEW v_transaction_summary AS
SELECT 
    a.id as account_id,
    a.username,
    COUNT(t.id) as total_transactions,
    SUM(CASE WHEN t.type = 'DEPOSIT' THEN t.amount ELSE 0 END) as total_deposit,
    SUM(CASE WHEN t.type = 'PURCHASE' THEN t.amount ELSE 0 END) as total_spent,
    MAX(t.created_at) as last_transaction
FROM account a
LEFT JOIN transaction t ON a.id = t.account_id
GROUP BY a.id, a.username;

-- ============================================
-- Stored Procedures
-- ============================================

DELIMITER //

-- Procedure: Create new account with player
CREATE PROCEDURE sp_create_account_with_player(
    IN p_username VARCHAR(50),
    IN p_password VARCHAR(255),
    IN p_email VARCHAR(100),
    IN p_player_name VARCHAR(50),
    IN p_gender TINYINT,
    IN p_head SMALLINT
)
BEGIN
    DECLARE v_account_id INT;
    
    START TRANSACTION;
    
    -- Insert account
    INSERT INTO account (username, password, email)
    VALUES (p_username, p_password, p_email);
    
    SET v_account_id = LAST_INSERT_ID();
    
    -- Insert player
    INSERT INTO player (account_id, name, gender, head)
    VALUES (v_account_id, p_player_name, p_gender, p_head);
    
    COMMIT;
    
    SELECT v_account_id as account_id, LAST_INSERT_ID() as player_id;
END //

DELIMITER ;

-- ============================================
-- Indexes for performance
-- ============================================

-- Additional indexes for common queries
CREATE INDEX idx_player_created ON player(created_at DESC);
CREATE INDEX idx_transaction_type_status ON transaction(type, status);
CREATE INDEX idx_account_vip ON account(vip_level DESC, vip_expire);

-- ============================================
-- Done!
-- ============================================

SELECT 'MySQL schema created successfully!' as status;
SELECT COUNT(*) as total_accounts FROM account;
SELECT COUNT(*) as total_players FROM player;

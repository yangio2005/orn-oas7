package com.girlkun.server;

import com.girlkun.jdbc.daos.PanelSettingDAO;
import com.girlkun.server.Maintenance;
import com.girlkun.server.Manager;
import com.girlkun.services.Service;
import com.girlkun.services.func.Input;
import com.girlkun.utils.Logger;
import com.girlkun.network.io.Message;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;

public class panel extends JPanel implements ActionListener {

    private JButton baotri, thaydoiexp, thaydoisk, chatserver, kickplayer, doitien;
    private JTextField bossSpawnTimeField;
    private JButton saveBossSpawnTimeButton;

    public panel() {
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.insets = new Insets(5, 5, 5, 5);

        baotri = createButton("Bảo Trì Máy Chủ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(baotri, gbc);

        thaydoiexp = createButton("Đổi Exp Server");
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(thaydoiexp, gbc);

        thaydoisk = createButton("Sự Kiện");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(thaydoisk, gbc);

        chatserver = createButton("Thông Báo Server");
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(chatserver, gbc);

        kickplayer = createButton("Đá All Player");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(kickplayer, gbc);

        doitien = createButton("Khuyến mãi Nạp");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(doitien, gbc);

        // New elements for Boss Spawn Time
        JLabel bossSpawnTimeLabel = new JLabel("Thời gian Boss Spawn (giây):");
        bossSpawnTimeLabel.setFont(new Font("Arial", Font.BOLD, 14));
        bossSpawnTimeLabel.setForeground(Color.CYAN);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1; // Reset gridwidth
        add(bossSpawnTimeLabel, gbc);

        bossSpawnTimeField = new JTextField(10);
        bossSpawnTimeField.setFont(new Font("Arial", Font.PLAIN, 14));
        bossSpawnTimeField.setBackground(Color.DARK_GRAY);
        bossSpawnTimeField.setForeground(Color.GREEN);
        // Load initial value from settings
        String currentBossSpawnTime = Manager.serverSettings.getOrDefault("BOSS_SPAWN_TIME", "300"); // Default to 300 seconds (5 minutes)
        bossSpawnTimeField.setText(currentBossSpawnTime);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(bossSpawnTimeField, gbc);

        saveBossSpawnTimeButton = createButton("Lưu thời gian Boss Spawn");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2; // Span across two columns
        add(saveBossSpawnTimeButton, gbc);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(this);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setForeground(Color.BLUE);
        button.setBackground(new Color(255, 255, 0));
        button.setFocusPainted(false);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == baotri) {
            Maintenance.gI().start(30);
            Logger.error("Tiến Hành Bảo Trì !\n");
        } else if (e.getSource() == thaydoiexp) {
            String exp = JOptionPane.showInputDialog(this, "Bảng Exp Server\n" 
                    + "Exp Server hiện tại: " + Manager.RATE_EXP_SERVER);
            if (exp != null) {
                try {
                    byte newExpRate = Byte.parseByte(exp);
                    Manager.RATE_EXP_SERVER = newExpRate;
                    // Save to DB
                    PanelSettingDAO.saveSetting("RATE_EXP_SERVER", String.valueOf(newExpRate), "Tỷ lệ EXP Server");
                    JOptionPane.showMessageDialog(this, "Đã lưu tỷ lệ EXP Server thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    Logger.error("Exp hiện tại là: " + newExpRate + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Tỷ lệ EXP không hợp lệ! Vui lòng nhập số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == thaydoisk) {
            String sk = JOptionPane.showInputDialog(this, "Bảng Sự Kiện\n"
                    + "Sự Kiện Server: " + Manager.SUKIEN
                    + "\n1 : Sự kiện Trung Thu"
                    + "\n2 : Sự kiện Hè"
                    + "\n3 : Sự kiện Tết"
                    + "\n4 : Sự kiện Valentine"
                    + "\n5 : Sự kiện Giỗ Tổ"
                    + "\n6 : Sự kiện Giáng Sinh"
                    + "\n7 : Sự kiện Halloween");
            if (sk != null) {
                Manager.SUKIEN = Byte.parseByte(sk);
                Logger.error("Sự Kiện: " + sk + "\n");
                if (Manager.SUKIEN == 1) {
                    Service.getInstance().sendThongBaoAllPlayer("|7|Sự kiện Trung thu đang được diễn ra"
                            + "\n|5|Thông tin chi tiết Sự kiện vui lòng xem tại NPC Trung thu tại Làng Aru");
                }
            }
        } else if (e.getSource() == chatserver) {
            String chat = JOptionPane.showInputDialog(this, "Thông Báo Server\n");
            if (chat != null) {
                Message msg = new Message(93);
                try {
                    msg.writer().writeUTF(chat);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
                }
                Service.getInstance().sendMessAllPlayer(msg);
                msg.cleanup();
                Logger.error("Thông báo: " + chat + "\n");
            }
        } else if (e.getSource() == kickplayer) {
            new Thread(() -> {
                Client.gI().close();
            }).start();
        } else if (e.getSource() == doitien) {
            String naptien = JOptionPane.showInputDialog(this, "Giá trị quy đổi Vàng và Ngọc\n" + "Hiện tại:  x" + Manager.KHUYEN_MAI_NAP + " Đổi tiền");
            if (naptien != null) {
                Manager.KHUYEN_MAI_NAP = Byte.parseByte(naptien);
                Logger.error("Giá trị Khuyến mãi hiện tại là: " + naptien + "\n");
            }
        } else if (e.getSource() == saveBossSpawnTimeButton) {
            String newSpawnTime = bossSpawnTimeField.getText();
            try {
                int spawnTime = Integer.parseInt(newSpawnTime);
                if (spawnTime <= 0) {
                    JOptionPane.showMessageDialog(this, "Thời gian spawn phải lớn hơn 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Manager.serverSettings.put("BOSS_SPAWN_TIME", newSpawnTime);
                PanelSettingDAO.saveSetting("BOSS_SPAWN_TIME", newSpawnTime, "Thời gian boss spawn (giây)");
                JOptionPane.showMessageDialog(this, "Đã lưu thời gian boss spawn thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                Logger.error("Thời gian Boss Spawn đã được cập nhật thành: " + newSpawnTime + " giây\n");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Thời gian spawn không hợp lệ! Vui lòng nhập số.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Ngọc rồng Tabi");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                Panel panel = new Panel();
                frame.getContentPane().add(panel);
                frame.setSize(400, 200);
                frame.setVisible(true);
            }
        });
    }
}

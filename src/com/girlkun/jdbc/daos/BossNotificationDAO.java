package com.girlkun.jdbc.daos;

import com.girlkun.database.GirlkunDB; // Assuming this import is correct and GirlkunDB is available in classpath
import com.girlkun.utils.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class BossNotificationDAO {

    public static void insertBossNotification(String bossName, String mapName, String status, String details) {
        PreparedStatement ps = null;
        try (Connection con = GirlkunDB.getConnection()) {
            String sql = "INSERT INTO boss_notifications (boss_name, map_name, notification_time, status, details) VALUES (?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, bossName);
            ps.setString(2, mapName);
            ps.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            ps.setString(4, status);
            ps.setString(5, details);
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.logException(BossNotificationDAO.class, e, "Lỗi khi chèn thông báo boss vào DB");
        } finally {
            // The PreparedStatement is automatically closed by the try-with-resources on the Connection
            // No explicit ps.close() is needed here.
        }
    }
}

package com.girlkun.jdbc.daos;

import com.girlkun.database.GirlkunDB;
import com.girlkun.utils.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class PanelSettingDAO {

    public static void saveSetting(String key, String value, String description) {
        PreparedStatement ps = null;
        try (Connection con = GirlkunDB.getConnection()) {
            String sql = "INSERT INTO server_settings (setting_key, setting_value, description) VALUES (?, ?, ?) " +
                         "ON DUPLICATE KEY UPDATE setting_value = ?, description = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, key);
            ps.setString(2, value);
            ps.setString(3, description);
            ps.setString(4, value);
            ps.setString(5, description);
            ps.executeUpdate();
        } catch (SQLException e) {
            Logger.logException(PanelSettingDAO.class, e, "Lỗi khi lưu cài đặt panel: " + key);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                Logger.logException(PanelSettingDAO.class, ex, "Lỗi khi đóng PreparedStatement trong saveSetting");
            }
        }
    }

    public static String loadSetting(String key) {
        String value = null;
        final int MAX_RETRIES = 3; // Define max retries
        for (int i = 0; i < MAX_RETRIES; i++) {
            try (Connection con = GirlkunDB.getConnection();
                 PreparedStatement ps = con.prepareStatement("SELECT setting_value FROM server_settings WHERE setting_key = ?")) {
                ps.setString(1, key);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        value = rs.getString("setting_value");
                    }
                }
                return value; // Return immediately on success
            } catch (SQLException e) {
                Logger.logException(PanelSettingDAO.class, e, "Lỗi khi tải cài đặt panel: " + key + " (Thử lại " + (i + 1) + "/" + MAX_RETRIES + ")");
                if (i == MAX_RETRIES - 1) { // If last retry, rethrow or log final error
                    Logger.logException(PanelSettingDAO.class, e, "Lỗi cuối cùng khi tải cài đặt panel: " + key);
                }
                // Optionally, add a small delay before retrying
                try {
                    Thread.sleep(100); // Sleep for 100ms
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return value; // Will be null if all retries fail
    }

    public static Map<String, String> loadAllSettings() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Map<String, String> settings = new HashMap<>();
        try (Connection con = GirlkunDB.getConnection()) {
            String sql = "SELECT setting_key, setting_value FROM server_settings";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                settings.put(rs.getString("setting_key"), rs.getString("setting_value"));
            }
        } catch (SQLException e) {
            Logger.logException(PanelSettingDAO.class, e, "Lỗi khi tải tất cả cài đặt panel");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                Logger.logException(PanelSettingDAO.class, ex, "Lỗi khi đóng tài nguyên trong loadAllSettings");
            }
        }
        return settings;
    }
}
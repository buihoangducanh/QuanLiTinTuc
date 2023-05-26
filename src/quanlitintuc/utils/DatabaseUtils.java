package quanlitintuc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author AnhBui
 */

public class DatabaseUtils {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/quanlitintuc";
        String username = "root";
        String password = "";
        return DriverManager.getConnection(url, username, password);
    }
}

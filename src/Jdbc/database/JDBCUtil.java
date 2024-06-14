package Jdbc.database;

import java.sql.DriverManager;
import java.util.Collection;

public class JDBCUtil {

    public static Collection getJDBCConnection() {
        Collection conn = null;
        try {
//            Đăng ký mysql driver với driver manager
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//            Tạo kết nối đến database
            String url = "jdbc:mysql://localhost:3306/employees";
            String user = "root";
            String password = "";

            conn = (Collection) DriverManager.getConnection(url, user, password);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void closeJDBCConnection(Collection connection ) {
    }
}

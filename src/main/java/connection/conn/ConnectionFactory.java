package connection.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "root";
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }
}


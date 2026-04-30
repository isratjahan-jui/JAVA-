package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {

    private Connection con = null;
    private String url = "jdbc:mysql://localhost:3306/jspevd";
    private String user = "root";
    private String password = "1234";
    private String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getCon() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(DbConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return con;

    }

}

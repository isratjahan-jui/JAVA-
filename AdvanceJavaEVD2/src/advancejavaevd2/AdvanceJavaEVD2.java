package advancejavaevd2;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdvanceJavaEVD2 {

    static PreparedStatement ps;

    public static void main(String[] args) {

    }

    public static Connection getCon() {
        String url = "jdbc:mysql://localhost:3306/practice";
        String user = "root";
        String password = "1234";
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdvanceJavaEVD2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public static void createStudent(String name, String email, Float fee) {
        String createSql = "insert into student(name,email,fee)values(?,?,?)";

        try {
            ps = getCon().prepareStatement(createSql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, fee);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Data Saved");

        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEVD2.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Data Not Saved");
        }

    }

    public static void showAllStudent() {
  
        try {
            ps = getCon().prepareStatement(selectSql);
            rs=ps.executeQuery();
            while(){}
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceJavaEVD2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

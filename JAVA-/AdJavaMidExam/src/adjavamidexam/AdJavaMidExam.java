package adjavamidexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdJavaMidExam {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

        saveEmployee("Badrul", "Excutive", 11000, "20-03-2021");
        saveEmployee("Pk", "Manager", 15000, "20-03-2023");
        saveEmployee("Emon", "CEO", 20000, "20-03-2019");
        showAllEmployee();
        System.out.println("-----------------------------------------");
        updateEmployee("Saharan", "Senior Manager", 17000, "20-03-2018", 2);
        showAllEmployee();
        System.out.println("-----------------------------------------");

        deleteEmployee(3);
        showAllEmployee();
        System.out.println("-----------------------------------------");
    }

    public static Connection getCon() {

        String url = "jdbc:mysql://localhost:3306/practice";
        String user = "root";
        String password = "1234";
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdJavaMidExam.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public static void saveEmployee(String name, String designation, float salary, String join_date) {
        String createSql = "insert into employee (name,designation,salary,join_date)values(?,?,?,?)";
        try {
            ps = getCon().prepareStatement(createSql);

            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setFloat(3, salary);
            ps.setString(4, join_date);

            ps.executeUpdate();
            ps.close();
            getCon().close();

            System.out.println("Data Saved");
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaMidExam.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Date Not Save");
        }
    }

    public static void showAllEmployee() {

        String createSql = "select * from Employee";
        try {
            ps = getCon().prepareStatement(createSql);

            rs = ps.executeQuery();
            while (rs.next()) {
                String employee = rs.getInt("id") + ".  Name:"
                        + rs.getString("name") + "  DG:"
                        + rs.getString("designation") + "   Salary:"
                        + rs.getFloat("salary") + "   Join_date:"
                        + rs.getString("join_date");
                System.out.println(employee);
            }
            ps.close();
            rs.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaMidExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateEmployee(String name, String designation, float salary, String join_date, int id) {

        String createSql = "update employee set name =?,designation=?,salary=?,join_date=? where id=?";
        try {
            ps = getCon().prepareStatement(createSql);
            ps.setString(1, name);
            ps.setString(2, designation);
            ps.setFloat(3, salary);
            ps.setString(4, join_date);
            ps.setInt(5, id);

            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Data Updated");

        } catch (SQLException ex) {
            Logger.getLogger(AdJavaMidExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteEmployee(int id) {

        String createSql = "delete from employee where id=?";
        try {
            ps = getCon().prepareStatement(createSql);
            ps.setInt(1, id);
            int status = ps.executeUpdate();
            if (status > 0) {
                System.out.println("Employee ID " + id + " Deleted");
            } else {
                System.out.println("Employee data not Deleted");
            }

            ps.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaMidExam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

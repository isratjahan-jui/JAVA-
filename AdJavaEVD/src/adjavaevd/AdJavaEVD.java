package adjavaevd;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdJavaEVD {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

        createEmployee("Badrul", 4000, "it");
        createEmployee("Pk", 4000, "it");
        createEmployee("Hasan", 4000, "it");
        showAllEmployee();
        System.out.println("-----------------------------------------");

        updateEmployee("Emon", 5000, "IT", 3);
        showAllEmployee();
        System.out.println("-----------------------------------------");

        deleteEmployee(2);
        showAllEmployee();
        System.out.println("-----------------------------------------");
    }

    public static Connection getCon(){

        String url = "jdbc:mysql://localhost:3306/practice";
        String user = "root";
        String password = "1234";
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdJavaEVD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public static void createEmployee(String name, float salary, String department) {
        String createSql = "insert into employee(name,salary,department)values(?,?,?)";
        try {
            ps = getCon().prepareStatement(createSql);
            ps.setString(1, name);
            ps.setFloat(2, salary);
            ps.setString(3, department);
            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Data saved");
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaEVD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data not saved");
        }
    }

    public static void showAllEmployee() {

        String createSql = "select * from employee";
        try {
            ps = getCon().prepareStatement(createSql);

            rs = ps.executeQuery();
            while (rs.next()) {

                String employee = rs.getInt("id") + "." + "  Name:" + rs.getString("name") + "  Salary:" + rs.getFloat("salary") + "  Department:" + rs.getString("department");
                System.out.println(employee);
            }
            ps.close();
            rs.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaEVD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateEmployee(String name, float salary, String department, int id) {
        String updateSql = "update employee set name =?, salary = ?, department=? where id=?";
        try {
    

            ps = getCon().prepareStatement(updateSql);
            ps.setString(1, name);

            ps.setFloat(2, salary);
            ps.setString(3, department);
            ps.setInt(4, id);

            ps.executeUpdate();
            ps.close();
            getCon().close();
            System.out.println("Data Updated");
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaEVD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteEmployee(int id) {
        String deleteSql = "delete from employee where id = ?";

        try {
            ps = getCon().prepareStatement(deleteSql);
            ps.setInt(1, id);

            int status = ps.executeUpdate();

            if (status > 0) {
                System.out.println("Employee ID " + id + " Deleted");
            } else {
                System.err.println("Employee Data Not Deleted");
            }

            ps.close();
            getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdJavaEVD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

package advanceemp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvanceEmp {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {

        String createSql = "insert into employee(name, salary,department) values(?,?,?)";
        String selectSql = "select * from employee";
        String deleteSql = "delete from employee where id = ?";
        String updateSql = "update employee set name =?, salary = ?, department=? where id=?";
        createEmployee("Badrul", 4000, "it");
        createEmployee("Pk", 4000, "it");
        createEmployee("Hasan", 4000, "it");
        showAllEmployee();
        System.out.println("-----------------------------------------");
//        deleteStudnet(4);
//        deleteStudnet(3);

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
            Logger.getLogger(AdvanceEmp.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(AdvanceEmp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data not saved");
        }

    }

    public static void showAllEmployee() {
        String selectSql = "select * from employee";
        try {
            ps = getCon().prepareStatement(selectSql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String employee = rs.getInt("id") + " " + rs.getString("name") + " " + rs.getFloat("salary") + " " + rs.getString("department");
                System.out.println(employee);
            }
            ps.close();
            rs.close();
            getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(AdvanceEmp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

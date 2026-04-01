package employee.dao;


import employee.model.EmpUser;
import employee.util.EmUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import java.util.logging.Logger;

public class EmpDao {

    EmUtil util = new EmUtil();
    PreparedStatement ps;
    String sql;

    public void saveEmpUser(EmpUser user) {
        sql = "insert into user(name,email,salary)values(?,?)";
        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setDouble(3, user.getSalary());
            ps.executeUpdate();

            ps.close();
            util.getCon().close();

            System.out.println("Data saved");

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public List<EmpUser> getAllEmpUser() {

        sql = "select * from employee";
        List<EmpUser> list = new ArrayList<>();
        EmpUser e;
        try {
            ps = util.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                e = new EmpUser(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDouble("salary")
                );
                list.add(e);

            }
            ps.close();
            rs.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmpDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}

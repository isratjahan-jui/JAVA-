package pos;

import pos.dao.UserDao;
import pos.model.User;

public class POS {

    public static void main(String[] args) {

        User u = new User("Badrul", "1234");

        UserDao d = new UserDao();

        d.saveUser(u);
        
    }

}

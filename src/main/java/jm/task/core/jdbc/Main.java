package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import javax.transaction.SystemException;
import java.sql.SQLException;

public class Main {
    private static final UserService user = new UserServiceImpl();

    public static void main(String[] args) throws SQLException, SystemException {
        Util util = new Util();
        util.getSessionFactory();
        user.createUsersTable();
        user.saveUser("Ivan","Ivanov", (byte) 30);
        user.saveUser("Andrey","Russkin", (byte) 41);
        user.saveUser("Alexey","Efremov", (byte) 30);
        user.saveUser("Maria","U", (byte) 30);
        user.removeUserById(3);
        for (User allUser : user.getAllUsers()) {
            System.out.println(allUser);
        }
        user.cleanUsersTable();
        user.dropUsersTable();

    }
}

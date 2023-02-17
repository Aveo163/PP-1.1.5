package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import javax.transaction.SystemException;
import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private static final UserDao userDaoHibernate= new UserDaoHibernateImpl();

    public void createUsersTable() throws SystemException {
        userDaoHibernate.createUsersTable();

    }

    public void dropUsersTable() throws SQLException, SystemException {
        userDaoHibernate.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) throws SystemException {
        userDaoHibernate.saveUser(name, lastName, age);

    }

    public void removeUserById(long id) throws SystemException {
        userDaoHibernate.removeUserById(id);

    }

    public List<User> getAllUsers() throws SystemException {
        return userDaoHibernate.getAllUsers();
    }

    public void cleanUsersTable() throws SystemException {
        userDaoHibernate.cleanUsersTable();

    }
}

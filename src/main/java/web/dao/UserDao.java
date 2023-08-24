package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> getAllUsers();
    User getUser(long id);
    void deleteUser(long id);
    void updateUser(long id, User user);
}

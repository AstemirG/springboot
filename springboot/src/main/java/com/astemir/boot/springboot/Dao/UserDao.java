package com.astemir.boot.springboot.Dao;

import com.astemir.boot.springboot.Model.User;
import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public User getUserById(int id);

    public void saveUser(User user);

    public void updateUser(int id, User updatedUser);

    public void deleteUser(int id);
}

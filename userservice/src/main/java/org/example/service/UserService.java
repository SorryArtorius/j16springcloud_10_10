package org.example.service;

import org.example.pojo.User;

import java.util.List;

public interface UserService {


    /**
     * 查询所有
     * @return 返回所有
     */
    List<User> getAllUsers();


    int updateUser(User user);

    int deleteUser(int id);
}

package org.example.service.impl;

import org.example.dao.UserDao;
import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;


    @Override
    public List<User> getAllUsers() {
        return userDao.selectList(null);
    }

    @Override
    public int updateUser(User user) {
        return userDao.update(user,null);
    }

    @Override
    public int deleteUser(int id) {
        return userDao.deleteById(id);
    }
}

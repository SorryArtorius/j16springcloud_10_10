package org.example.service.impl;

import org.example.dao.AdminDao;
import org.example.pojo.Admin;
import org.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public int registeredAdmin(Admin admin) {
        return adminDao.registeredAdmin(admin);
    }

    @Override
    public Admin findAdmin(String username) {
        return adminDao.findAdmin(username);
    }
}

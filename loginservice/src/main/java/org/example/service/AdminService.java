package org.example.service;

import org.example.pojo.Admin;

public interface AdminService {

    int registeredAdmin(Admin admin);


    Admin findAdmin(String username);
}

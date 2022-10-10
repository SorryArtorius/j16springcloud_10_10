package org.example.dao;


import org.example.pojo.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao {


  int registeredAdmin(Admin admin);


  Admin findAdmin(String username);
}

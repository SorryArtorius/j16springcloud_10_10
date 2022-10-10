package org.example.controller;


import org.example.pojo.Admin;
import org.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public ResponseEntity login(@RequestParam("username") String username, @RequestParam("password") String password) {
        if (adminService.findAdmin(username) != null) {
            Admin admin = adminService.findAdmin(username);
            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                return ResponseEntity.ok("登录成功");
            } else {
                return ResponseEntity.status(500).body("账户或密码错误");
            }

        } else {
            return ResponseEntity.status(500).body("账户不存在");
        }
    }

    @PostMapping(value = "/admin/register")
    public ResponseEntity register(@RequestBody Admin admin) {
        if (adminService.registeredAdmin(admin) > 0) {
            return ResponseEntity.ok("注册成功");
        } else {
            return ResponseEntity.status(500).body("注册失败");
        }
    }
}

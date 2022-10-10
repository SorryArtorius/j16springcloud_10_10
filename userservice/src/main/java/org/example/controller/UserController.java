package org.example.controller;


import com.alibaba.fastjson.JSON;
import org.example.pojo.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/getAll")
    public ResponseEntity getAll() {
        return ResponseEntity.ok(JSON.toJSONString(userService.getAllUsers()));
    }

    @GetMapping("/user/del")
    public ResponseEntity del(@RequestParam("id") Integer id) {
        return ResponseEntity.ok(JSON.toJSONString(userService.deleteUser(id)));
    }

    @PostMapping("/user/update")
    public ResponseEntity update(@RequestBody User user) {
        return ResponseEntity.ok(JSON.toJSONString(userService.updateUser(user)));
    }
}

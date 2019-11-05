package com.ryml.controller;

import com.ryml.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author len
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public Integer findById(@PathVariable Long id) {
        return 1;
    }

    @RequestMapping("/getUserById")
    public User getUserById(@RequestBody User user) {
        return user;
    }

}
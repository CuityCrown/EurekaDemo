package com.ryml.controller;

import com.ryml.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * description:
 *
 * @author 刘一博
 * @version V1.0
 * @date 2019/11/5 11:00
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
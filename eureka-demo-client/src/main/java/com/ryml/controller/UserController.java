package com.ryml.controller;

import com.ryml.entity.User;
import com.ryml.service.InventorySquaresetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    private InventorySquaresetService inventorySquaresetService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    @ResponseBody
    public Object findById(@PathVariable Long id) {
        Integer byId = inventorySquaresetService.findById(id);
        Object forObject = restTemplate.getForObject("http://MYEUREKADEMO/user/" + id, Object.class);
        return byId;
    }

    @RequestMapping("/getUserById")
    @ResponseBody
    public User getUserById(User user) {
        User user1 = new User();
        user1.setName("yyx");
        user1.setId(2);
        user1.setAge("18");
        user = inventorySquaresetService.getUserById(user1);
        return user;
    }

}
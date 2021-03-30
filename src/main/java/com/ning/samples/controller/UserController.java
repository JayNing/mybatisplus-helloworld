package com.ning.samples.controller;

import com.ning.samples.entity.User;
import com.ning.samples.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: UserController
 * Description:
 * date: 2021/3/29 16:08
 *
 * @author ningjianjian
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/query")
    public @ResponseBody List<User> queryUser(User user){
        return userService.queryUser(user);
    }

    @PostMapping("/add")
    public void addUser(User user){
        userService.addUser(user);
    }

    @PostMapping("/update")
    public void updateUser(User user){
        userService.updateUser(user);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam("id") Long id){
        User user = new User();
        user.setId(id);
        userService.deleteUser(user);
    }

}

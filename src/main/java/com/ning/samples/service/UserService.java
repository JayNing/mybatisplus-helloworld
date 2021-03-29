package com.ning.samples.service;

import com.ning.samples.entity.User;

import java.util.List;

/**
 * ClassName: UserService
 * Description:
 * date: 2021/3/29 15:53
 *
 * @author ningjianjian
 */
public interface UserService{
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    List<User> queryUser(User user);

    void batchInsertUser(List<User> userList);

}

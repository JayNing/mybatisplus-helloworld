package com.ning.samples.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.ning.samples.entity.User;
import com.ning.samples.mapper.UserMapper;
import com.ning.samples.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: UserServiceImpl
 * Description:
 * date: 2021/3/29 15:53
 *
 * @author ningjianjian
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateById(user);
    }

    @Override
    public void deleteUser(User user) {
        userMapper.deleteById(user.getId());
    }

    @Override
    public List<User> queryUser(User user) {
        return userMapper.selectList(null);
    }

    @Override
    public void batchInsertUser(List<User> userList) {
        //批量插入

    }
}

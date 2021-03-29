package com.ning.samples.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ning.samples.entity.Role;
import com.ning.samples.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * ClassName: RoleController
 * Description:
 * date: 2021/3/29 17:30
 *
 * @author ningjianjian
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("query")
    public @ResponseBody List<Role> query(Role role){
        QueryWrapper<Role> query = Wrappers.query(role);
        return roleService.list(query);
    }

    @RequestMapping("add")
    public void add(Role role){
        roleService.save(role);
    }

    @RequestMapping("batchAdd")
    public void batchAdd(){
        List<Role> roleList = new ArrayList<>();
        for (long i = 1 ;i <= 5; i++){
            Role role = new Role();
            role.setId(i);
            role.setName("role_" + i);
            role.setLv((int)i);
            roleList.add(role);
        }
        roleService.saveBatch(roleList);
    }


}

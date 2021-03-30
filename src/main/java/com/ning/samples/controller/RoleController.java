package com.ning.samples.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.ning.samples.entity.Role;
import com.ning.samples.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@Api(tags = "角色管理")
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @ApiOperation("列表条件查询")
    @GetMapping("query")
    public @ResponseBody List<Role> query(Role role){
        QueryWrapper<Role> query = Wrappers.query(role);
        return roleService.list(query);
    }

    @ApiOperation(value = "新增", notes = "insert使共用")
    @PostMapping("add")
    public void add(@RequestBody Role role){
        roleService.save(role);
    }

    @ApiOperation("批量新增")
    @PostMapping("batchAdd")
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

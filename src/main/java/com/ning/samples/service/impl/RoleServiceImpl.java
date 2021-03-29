package com.ning.samples.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ning.samples.entity.Role;
import com.ning.samples.mapper.RoleMapper;
import com.ning.samples.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * ClassName: RoleServiceImpl
 * Description:
 * date: 2021/3/29 17:21
 *
 * @author ningjianjian
 */
@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
}

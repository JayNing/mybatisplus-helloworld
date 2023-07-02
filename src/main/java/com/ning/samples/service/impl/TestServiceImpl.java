package com.ning.samples.service.impl;

import com.ning.samples.entity.Test;
import com.ning.samples.mapper.TestMapper;
import com.ning.samples.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JayNing
 * @since 2023-07-02
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

}

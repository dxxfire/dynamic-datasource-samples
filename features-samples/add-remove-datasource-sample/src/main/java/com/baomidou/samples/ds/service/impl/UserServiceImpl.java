package com.baomidou.samples.ds.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.samples.ds.entity.User;
import com.baomidou.samples.ds.mapper.UserMapper;
import com.baomidou.samples.ds.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author robin
 */
@Service
@DS("slave")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @DS("#session.tenantName")
    public List<User> selectSpelBySession() {
        return userMapper.selectUsers();
    }

    @Override
    @DS("#header.tenantName")
    public List<User> selectSpelByHeader() {
        return userMapper.selectUsers();
    }

    @Override
    @DS("#tenantName")
    public List<User> selectSpelByKey(String tenantName) {
        return userMapper.selectUsers();
    }

    @Override
    @DS("#user.tenantName")
    public List<User> selecSpelByTenant(User user) {
        return userMapper.selectUsers();
    }
}
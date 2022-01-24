package com.terwergreen.dao;

import com.terwergreen.pojo.User;

import java.util.List;

/**
 * 用户映射类
 *
 * @name: UserMapper
 * @author: terwer
 * @date: 2022-01-24 21:44
 **/
public interface UserMapper{
    public User findByCondition(User user);
}

package com.terwergreen.service;

/**
 * 登录业务
 *
 * @name: LoginService
 * @author: terwer
 * @date: 2022-01-24 22:04
 **/
public interface LoginService {
    /**
     * 登录处理
     *
     * @param username
     * @param password
     * @return
     */
    public boolean doLogin(String username, String password);
}

package com.terwergreen.service.impl;

import com.terwergreen.dao.UserMapper;
import com.terwergreen.pojo.User;
import com.terwergreen.service.LoginService;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录业务
 *
 * @name: LoginServiceImpl
 * @author: terwer
 * @date: 2022-01-24 22:06
 **/
@Service
public class LoginServiceImpl implements LoginService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SqlSession session;

    public boolean doLogin(String username, String password) {
        logger.info("开始处理登录");

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User result = session.selectOne("findByCondition", user);

        if (null != result) {
            logger.info("用户信息校验成功");
            return true;
        }

        logger.info("用户不存在或者密码错误");
        return false;
    }
}

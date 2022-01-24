package com.terwergreen.controller;

import com.terwergreen.constant.Constant;
import com.terwergreen.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 登录控制器
 *
 * @name: LoginController
 * @author: terwer
 * @date: 2022-01-24 16:36
 **/
@RequestMapping("/login")
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(String username, String password, HttpServletRequest request) {
        HttpSession session = request.getSession();

        if (loginService.doLogin(username, password)) {
            request.getSession().setAttribute(Constant.SESSION_USERNAME_KEY, username);
            session.setAttribute(Constant.SESSION_LOGIN_FAIL_MSG_KEY, "");
            return "redirect:/demo/result";
        }

        session.setAttribute(Constant.SESSION_LOGIN_FAIL_MSG_KEY, Constant.SESSION_LOGIN_FAIL_MSG);
        return "login";
    }
}

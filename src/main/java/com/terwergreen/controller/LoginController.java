package com.terwergreen.controller;

import com.terwergreen.constant.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(String username, String password, HttpServletRequest request) {
        if ("test".equals(username) && "test".equals(password)) {
            request.getSession().setAttribute(Constant.SESSION_USERNAME_KEY,username);
            return "redirect:/demo/result";
        }

        return "login";
    }
}

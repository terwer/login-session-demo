package com.terwergreen.interceptor;

import com.terwergreen.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录拦截器
 *
 * @name: LoginInterceptor
 * @author: terwer
 * @date: 2022-01-24 17:46
 **/
@Component
public class LoginInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 利用Session校验登录状态实现登录拦截
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("进入登录拦截器");
        HttpSession session = request.getSession();
        Object username = session.getAttribute(Constant.SESSION_USERNAME_KEY);
        if (null == username) {
            logger.info("未登录或者登录失效");
            session.setAttribute( Constant.SESSION_LOGIN_FAIL_MSG_KEY, Constant.SESSION_LOGIN_FAIL_MSG);
            response.sendRedirect(request.getContextPath() + "/login/toLogin");
            return false;
        }

        session.setAttribute( Constant.SESSION_LOGIN_FAIL_MSG_KEY, "");
        logger.info("从Session中获取的登录名：" + username);
        return true;
    }
}

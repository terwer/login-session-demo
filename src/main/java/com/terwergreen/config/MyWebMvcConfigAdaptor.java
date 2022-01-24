package com.terwergreen.config;

import com.terwergreen.interceptor.LoginInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Spring  MVC自定义配置
 *
 * @name: MyWebMvcConfigAdaptor
 * @author: terwer
 * @date: 2022-01-24 17:51
 **/
@Configuration
public class MyWebMvcConfigAdaptor implements WebMvcConfigurer {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册拦截器
        // 默认拦截所有
        // 排除登录页面本身还有错误页面
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/login/**", "/error");

        logger.info("登录拦截器已添加");
    }
}

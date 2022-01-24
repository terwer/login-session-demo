package com.terwergreen.loginsessiondemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 1）基于SpringBoot实现一个登陆功能（含有登录拦截验证）
 * <p>
 * 2）使用Spring Session进行Session一致性控制
 * <p>
 * 3）将工程打成war包
 * <p>
 * 4）将war包部署到tomcat集群中，要求1个Nginx节点、2个Tomcat节点
 * <p>
 * 请求 —> Nginx（轮询策略） —> Tomcat1 / Tomcat2
 * <p>
 * 5）完成测试
 */
@SpringBootTest
class LoginSessionDemoApplicationTests {

    @Test
    void contextLoads() {
    }

}

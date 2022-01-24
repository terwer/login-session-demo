package com.terwergreen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 业务页面
 *
 * @name: ResultController
 * @author: terwer
 * @date: 2022-01-24 21:01
 **/
@RequestMapping("/demo")
@Controller
public class DemoController {

    @RequestMapping("/result")
    public String result(){
        return "result";
    }
}

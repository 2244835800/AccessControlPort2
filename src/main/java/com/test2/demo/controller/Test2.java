package com.test2.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author:hepo
 * @Version:v1.0
 * @Description:
 * @Date:2018/9/19/019
 * @Time:10:49
 */
@Controller
public class Test2 {

    @GetMapping("/index")
    public String require() {
        return "index";
    }
}

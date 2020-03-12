package com.louis.mango.producer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fangzf
 * @create 2020-03-12 12:29
 */
@Controller
@ResponseBody
public class HelloController {
    @RequestMapping("/hello")
    public  String hello(){
        return "hello  world";
    }

}

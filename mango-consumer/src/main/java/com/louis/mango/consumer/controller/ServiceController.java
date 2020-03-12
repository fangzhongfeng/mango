package com.louis.mango.consumer.controller;

import com.louis.mango.consumer.api.MangoProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sun.dc.pr.PRError;

import java.lang.reflect.ParameterizedType;

/**
 * @author fangzf
 * @create 2020-03-12 18:51
 */
@RestController
public class ServiceController {

    @Autowired
    private  RestTemplate restTemplate;

    @Autowired
    private MangoProducerService  mangoProducerService;




    @RequestMapping("/ribbon/hello")
    public   String call(){
          String  callMess=restTemplate.getForObject("http://maogo-producer/hello",String.class);
          return  callMess;
    }

    @RequestMapping("/ribbon/hello2")
    public   String call2(){
        String hello = mangoProducerService.hello();
        return hello;
    }
}

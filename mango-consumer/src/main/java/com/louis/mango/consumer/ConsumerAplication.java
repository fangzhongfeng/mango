package com.louis.mango.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author fangzf
 * @create 2020-03-12 18:50
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerAplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerAplication.class,args);
    }


    @LoadBalanced
    @Bean
    public RestTemplate  restTemplate(){
        return  new RestTemplate();
    }
}

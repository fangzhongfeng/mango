package com.louis.mango.consumer.api;

import com.louis.mango.consumer.hystrix.MangoProducerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fangzf
 * @create 2020-03-12 20:56
 */
@FeignClient(name = "maogo-producer",fallback = MangoProducerHystrix.class)
public interface MangoProducerService {

    @RequestMapping("/hello")
    public String hello();

}

package com.louis.mango.consumer.hystrix;

import com.louis.mango.consumer.api.MangoProducerService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fangzf
 * @create 2020-03-12 22:11
 */
@Component
public class MangoProducerHystrix  implements MangoProducerService {


    @Override
    @RequestMapping("/hello")
    public String hello() {
        return "sorry,call  failed";
    }
}

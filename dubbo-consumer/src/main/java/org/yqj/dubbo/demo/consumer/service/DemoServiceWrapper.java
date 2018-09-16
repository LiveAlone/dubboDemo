package org.yqj.dubbo.demo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.yqj.dubbo.demo.api.DemoService;

/**
 * Created by yaoqijun on 2018/6/10.
 * email: yaoqijunmail@foxmail.com
 */
@Component
public class DemoServiceWrapper {

    @Reference
    private DemoService demoService;

    public String sayHelloWrapper(String name){
        return demoService.sayHello(name);
    }
}

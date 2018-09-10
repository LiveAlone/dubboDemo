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

    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            url = "dubbo://127.0.0.1:12345")
    private DemoService demoService;

    public String sayHelloWrapper(String name){
        return demoService.sayHello(name);
    }
}

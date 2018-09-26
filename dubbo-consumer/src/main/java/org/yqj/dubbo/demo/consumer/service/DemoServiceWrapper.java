package org.yqj.dubbo.demo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.yqj.dubbo.demo.api.DemoService;

/**
 * Created by yaoqijun on 2018/6/10.
 * email: yaoqijunmail@foxmail.com
 * @author yaoqijun
 */
@Component
public class DemoServiceWrapper {

    @Reference(retries = 3)
    private DemoService demoService;

    public String sayHelloWithFirstFail(String name){
        return demoService.sayHelloWith50RateFail(name);
    }

    public String sayHelloWrapper(String name){
        return demoService.sayHello(name);
    }
}

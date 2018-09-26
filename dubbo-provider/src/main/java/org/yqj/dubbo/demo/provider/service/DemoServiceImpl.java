package org.yqj.dubbo.demo.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.yqj.dubbo.demo.api.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author yaoqijun on 2018-01-31.
 */
@Service
@Component
@Slf4j
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHelloWith50RateFail(String name) {
        int value = ThreadLocalRandom.current().nextInt();
        log.info("current value is {}, remote address is :{}", value, RpcContext.getContext().getRemoteAddressString());
        if (value % 2 == 0){
            return "reply by " + RpcContext.getContext().getLocalAddressString() + " is : hello " + name;
        }else {
            throw new RuntimeException();
        }
    }

    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddressString();
    }

    @Override
    public String sayHelloAgain(String name) {
        return "Hello again " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }
}

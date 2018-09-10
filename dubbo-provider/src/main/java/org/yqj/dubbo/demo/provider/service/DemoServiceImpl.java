package org.yqj.dubbo.demo.provider.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import org.yqj.dubbo.demo.api.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yaoqijun on 2018-01-31.
 */
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override
    public String sayHelloAgain(String name) {
        return "Hello again " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }
}

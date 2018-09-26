package org.yqj.dubbo.demo.consumer;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.yqj.dubbo.demo.consumer.service.DemoServiceWrapper;

/**
 * Created by yaoqijun.
 * @author yaoqijun
 * Date:2016-04-27
 * Email:yaoqj@terminus.io
 * Descirbe:
 */
@Component
@Slf4j
public class RunCommandLine implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
    }
}

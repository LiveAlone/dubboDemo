package org.yqj.dubbo.demo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.alibaba.dubbo.spring.boot.context.event.DubboBannerApplicationListener;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yaoqijun.
 * Date:2016-04-27
 * Email:yaoqj@terminus.io
 * Descirbe:
 */
@SpringBootApplication
@EnableDubboConfiguration
public class BootDemoApplication {
    public static void main(String[] args) {
        DubboBannerApplicationListener.setBANNER_MODE(Banner.Mode.OFF);
        new SpringApplicationBuilder()
                .bannerMode(Banner.Mode.OFF)
                .sources(BootDemoApplication.class)
                .run(args);
    }
}

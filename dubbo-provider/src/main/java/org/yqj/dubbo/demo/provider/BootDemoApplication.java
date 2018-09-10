package org.yqj.dubbo.demo.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.alibaba.dubbo.spring.boot.context.event.DubboBannerApplicationListener;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

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
                .web(false)
                .sources(BootDemoApplication.class)
                .run(args);
    }
}

package org.yqj.dubbo.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.yqj.dubbo.demo.api.TeacherInfoService;

/**
 * @author yaoqijun on 2018-06-08.
 */
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class TeacherInfoServiceImpl implements TeacherInfoService {
    @Override
    public String gainTeacherInfoService(Long id) {
        return "this is teacher info " + id;
    }
}

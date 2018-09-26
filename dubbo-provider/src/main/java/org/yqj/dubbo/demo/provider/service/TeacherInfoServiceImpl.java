package org.yqj.dubbo.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import org.yqj.dubbo.demo.api.TeacherInfoService;

/**
 * @author yaoqijun on 2018-06-08.
 */
//@Service
//@Component
public class TeacherInfoServiceImpl implements TeacherInfoService {
    @Override
    public String gainTeacherInfoService(Long id) {
        return "this is teacher info " + id;
    }
}

package org.yqj.dubbo.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import org.yqj.dubbo.demo.api.StudentInfoService;

/**
 * @author yaoqijun on 2018-06-08.
 */
@Service
@Component
public class StudentInfoServiceImpl implements StudentInfoService {
    @Override
    public String gainStudentInfo(Long id) {
        return "this is student info " + id;
    }
}

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.yqj.dubbo.demo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yqj.dubbo.demo.consumer.service.DemoServiceWrapper;

/**
 * Demo Consumer Controller (REST)
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @see
 * @since 1.0.0
 */
@RestController("consumer_controller")
public class DemoConsumerController {

    @Autowired
    private DemoServiceWrapper demoServiceWrapper;

    @RequestMapping("/sayHelloWithFail")
    public String sayHelloWithRetry(@RequestParam String name){
        return demoServiceWrapper.sayHelloWithFirstFail(name);
    }

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoServiceWrapper.sayHelloWrapper(name);
    }
}

/*
 * Copyright & License.
 */

package com.jelly.demo.platform.sboot.dubbo.consumer.controller;

import com.jelly.demo.platform.sboot.dubbo.consumer.service.UserServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 *
 * @author liuzhudong
 * @version 1.0
 * @date 18/5/15 下午4:27
 * @Copyright www.xnqkl.com
 */
@RestController
public class TestController {

    @Autowired
    private UserServiceConsumer userServiceConsumer;

    @RequestMapping("/test")
    public Object test() {
        userServiceConsumer.saveUser();
        return "OK";
    }

}

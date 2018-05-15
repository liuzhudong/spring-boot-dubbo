/*
 * Copyright & License.
 */

package com.jelly.demo.platform.sboot.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jelly.demo.platform.sboot.dubbo.domain.UserEnity;
import com.jelly.demo.platform.sboot.dubbo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 用户服务消费
 *
 * @author liuzhudong
 * @version 1.0
 * @date 18/5/15 下午4:21
 * @Copyright www.xnqkl.com
 */
@Component
public class UserServiceConsumer {

    private final Logger logger = LoggerFactory.getLogger(UserServiceConsumer.class);

//    @Reference(url = "dubbo://192.168.1.175:20880")
    @Reference
    private UserService userService;

    public void saveUser() {
        logger.info("测试调度dubbo provider ");
        UserEnity userEnity = new UserEnity();
        userEnity.setName("liuzd");
        userEnity.setAge(20);
        userEnity.setMessage("sssss hello aaaaa");

        logger.info("===> save user {}", userEnity);
        userService.save(userEnity);

    }

}

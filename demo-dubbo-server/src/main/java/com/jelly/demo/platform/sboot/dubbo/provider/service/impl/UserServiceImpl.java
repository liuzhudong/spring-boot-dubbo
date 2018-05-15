/*
 * Copyright & License.
 */

package com.jelly.demo.platform.sboot.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jelly.demo.platform.sboot.dubbo.domain.UserEnity;
import com.jelly.demo.platform.sboot.dubbo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 用户服务的实现
 *
 * @author liuzhudong
 * @version 1.0
 * @date 18/5/15 下午4:06
 * @Copyright www.xnqkl.com
 */
@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public void save(UserEnity userEnity) {
        logger.info("===> 保存 {}", userEnity);
    }
}

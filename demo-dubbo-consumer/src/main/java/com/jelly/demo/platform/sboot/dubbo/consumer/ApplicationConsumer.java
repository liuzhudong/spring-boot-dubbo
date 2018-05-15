/*
 * Copyright & License.
 */

package com.jelly.demo.platform.sboot.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动器
 *
 * @author liuzhudong
 * @version 1.0
 * @date 18/5/15 下午4:05
 * @Copyright www.xnqkl.com
 */
@SpringBootApplication
@EnableDubboConfiguration
public class ApplicationConsumer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumer.class, args);
    }

}

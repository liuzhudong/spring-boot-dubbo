/*
 * Copyright & License.
 */

package com.jelly.demo.platform.sboot.dubbo.provider;

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
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

/*
 * Copyright & License.
 */

package com.jelly.demo.platform.sboot.dubbo.domain;

import java.io.Serializable;

/**
 * 用户实体
 *
 * @author liuzhudong
 * @version 1.0
 * @date 18/5/15 下午3:57
 * @Copyright www.xnqkl.com
 */
public class UserEnity implements Serializable {

    private static final long serialVersionUID = 888387746176309974L;

    private String name;
    private int age;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "UserEnity{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", message='" + message + '\'' +
            '}';
    }
}

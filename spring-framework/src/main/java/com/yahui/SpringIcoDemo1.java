package com.yahui;

import com.yahui.bean.springicodemo.UserDto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yahui
 * @version 1.0.0
 * @ClassName SpringIcoDemo1.java
 * @Description TODO
 * @createTime 2022-06-20 23:03:03
 */
public class SpringIcoDemo1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("UserConfig.xml");
        UserDto userDto = context.getBean("user",UserDto.class);
        System.out.println(userDto.getAge()+userDto.getName());
    }
}

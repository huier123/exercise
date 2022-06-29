package com.yahui.springdi;

import com.yahui.springdi.bean.SimpleMovieLister;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author houyahui1
 * @description
 * @date 2022/6/29 19:17
 */
public class SpringDIDemo {

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdi/SpringDiDemo.xml");
        SimpleMovieLister simpleMovieLister = applicationContext.getBean("simpleMovieLister", SimpleMovieLister.class);
        System.out.println(simpleMovieLister.toString());
    }
}

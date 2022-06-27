package com.yahui;

import com.yahui.bean.springicodemo.UserDto;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author yahui
 * @version 1.0.0
 * @ClassName SpringIcoDemo1.java
 * @Description TODO
 * @createTime 2022-06-20 23:03:03
 */
public class SpringIcoDemo1 {

    public static void main(String[] args) {
        UserDto userDto = getUserDtoByBeanFactory(UserDto.class);
        System.out.println(userDto.getAge()+userDto.getName());
    }

    //由于ClassPathXmlApplicationContext继承自AbstractApplicationContext，并且在new的时候执行了refresh，所以不需要显示的调用这个方法
    private static UserDto getApplicationContextBean(Class<UserDto> userDtoClass){
        ApplicationContext context = new ClassPathXmlApplicationContext("UserConfig.xml");
        return context.getBean("user",userDtoClass);
    }

    //GenericApplicationContext需要显示的调用refresh
    private static UserDto getGenericApplicationContext(Class<UserDto> userDtoClass){
        GenericApplicationContext genericApplicationContext = new GenericApplicationContext();
        new XmlBeanDefinitionReader(genericApplicationContext).loadBeanDefinitions("UserConfig.xml");
        genericApplicationContext.refresh();
        return genericApplicationContext.getBean("user",userDtoClass);
    }

    private static UserDto getUserDtoByBeanFactory(Class<UserDto> userDtoClass){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerSingleton("user",new UserDto());
        System.out.println(beanFactory.getType("user"));
        return beanFactory.getBean(userDtoClass);
    }
}

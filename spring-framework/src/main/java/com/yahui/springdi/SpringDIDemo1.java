package com.yahui.springdi;

import com.yahui.springdi.bean.CommandManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author houyahui1
 * @description
 * @date 2022/7/11 20:24
 */
public class SpringDIDemo1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springdi/SpringDiDemo1.xml");
        CommandManager commandManager = (CommandManager) applicationContext.getBean("commandManager");
        commandManager.process("nihao");
    }
}

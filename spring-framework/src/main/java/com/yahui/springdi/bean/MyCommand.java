package com.yahui.springdi.bean;

import org.springframework.stereotype.Component;

/**
 * @author houyahui1
 * @description
 * @date 2022/7/11 19:56
 */
public class MyCommand extends Command{

    public Object execute(){
        System.out.println("MyCommand state : " + this.getState());
        return this;
    }
}

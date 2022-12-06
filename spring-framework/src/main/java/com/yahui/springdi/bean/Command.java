package com.yahui.springdi.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author houyahui1
 * @description
 * @date 2022/7/11 19:50
 */
public class Command {

    private Object state;

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Object execute(){
        System.out.println("command state : " + this.getState());
        return this;
    }
}

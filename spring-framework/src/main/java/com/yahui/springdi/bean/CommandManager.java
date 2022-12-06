package com.yahui.springdi.bean;

import org.springframework.beans.factory.annotation.Lookup;

/**
 * @author houyahui1
 * @description
 * @date 2022/7/11 19:47
 */
public abstract class CommandManager {

    public Object process(Object commandState){
        // grab a new instance of the appropriate Command interface
        Command command = createCommand();
        // set the state on the (hopefully brand new) Command instance
        command.setState(commandState);
        return command.execute();

    }

    @Lookup("myCommand")
    protected abstract Command createCommand();
}

package com.yahui.springdi.bean;

/**
 * @author houyahui1
 * @description
 * @date 2022/6/29 19:14
 */
public class MovieFinder {

    private Integer num;

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "MovieFinder{" +
                "num=" + num +
                '}';
    }
}

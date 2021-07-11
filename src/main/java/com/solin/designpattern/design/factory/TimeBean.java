package com.solin.designpattern.design.factory;

import com.solin.designpattern.design.factory.i.IBean;

public class TimeBean implements IBean {



    private String name;
    public TimeBean(String name){
        this.name = name;
    }

    @Override
    public String speak() {
        return this.name;
    }
}

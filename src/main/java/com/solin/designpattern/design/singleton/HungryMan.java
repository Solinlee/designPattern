package com.solin.designpattern.design.singleton;

public  class HungryMan {
    private  static HungryMan hungryMan = new HungryMan();
    private HungryMan(){
    }
    public static HungryMan getInstance(){
        return hungryMan;
    }

}

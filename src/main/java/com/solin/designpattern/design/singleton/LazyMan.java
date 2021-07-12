package com.solin.designpattern.design.singleton;

public class LazyMan {
    private  static LazyMan lazyMan = null;
    private LazyMan(){
    }
    public synchronized static LazyMan getInstance(){
        if(lazyMan ==null){
        try {
            long l = new Double(Math.random() * 10000).longValue();
            System.out.println("l = " + l);
            Thread.sleep(Math.abs(l));
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
            lazyMan = new LazyMan();
        }
        return lazyMan;
    }

}

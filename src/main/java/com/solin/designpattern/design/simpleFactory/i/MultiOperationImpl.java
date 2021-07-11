package com.solin.designpattern.design.simpleFactory.i;

public class MultiOperationImpl implements IOperation {
    @Override
    public void getMethod() {
        System.out.println("乘法");
    }
}

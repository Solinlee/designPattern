package com.solin.designpattern.design.simpleFactory;

import com.solin.designpattern.design.simpleFactory.i.IOperation;

public class DelOperationImpl implements IOperation {
    @Override
    public void getMethod() {
        System.out.println("减法");
    }
}

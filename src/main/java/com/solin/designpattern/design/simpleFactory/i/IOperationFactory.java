package com.solin.designpattern.design.simpleFactory.i;


public interface IOperationFactory {

    IOperation method(String method) throws Exception;
}

package com.solin.designpattern.design.simpleFactory;

import com.solin.designpattern.design.simpleFactory.i.DiviOperationImpl;
import com.solin.designpattern.design.simpleFactory.i.IOperation;
import com.solin.designpattern.design.simpleFactory.i.IOperationFactory;
import com.solin.designpattern.design.simpleFactory.i.MultiOperationImpl;
import org.springframework.stereotype.Service;

@Service("operationFactory")
public class OperationFactoryImpl implements IOperationFactory {
    @Override
    public IOperation method(String method) throws Exception {
        switch (method){
            case "add":
                return new AddOperationImpl();
            case "del":
                return new DelOperationImpl();
            case "multi":
                return new MultiOperationImpl();
            case "divi":
                return new DiviOperationImpl();
            default:
            throw  new Exception( "不支持的类型:"+method );
        }
    }
}

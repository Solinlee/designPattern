package com.solin.designpattern.design;

import com.solin.designpattern.design.simpleFactory.i.IOperationFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleFactoryTest {


    @Autowired
    private IOperationFactory operationFactory;
    @Test
    public void testSimpleFactory() throws Exception {
        operationFactory.method("add").getMethod();
        operationFactory.method("del").getMethod();
        operationFactory.method("add").getMethod();
        operationFactory.method("add").getMethod();
    }

}

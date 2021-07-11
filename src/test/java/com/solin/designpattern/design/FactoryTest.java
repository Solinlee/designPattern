package com.solin.designpattern.design;

import com.solin.designpattern.design.factory.i.FactoryBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryTest {

    @Qualifier("timeFactory")
    @Autowired
    private FactoryBean timeFactory;

    @Resource(name = "proxyFactory")
    private FactoryBean proxyFactory;

    @Test
    public void testFactory(){
        System.out.println( timeFactory.getBean().speak());
        System.out.println(proxyFactory.getBean().speak());
    }


}

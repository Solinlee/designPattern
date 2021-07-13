package com.solin.designpattern.design;

import com.solin.designpattern.design.abstractFactory.i.IHumanFactory;
import com.solin.designpattern.design.abstractFactory.i.IMakeMoney;
import com.solin.designpattern.design.abstractFactory.i.IStudy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AbstractFactoryTest {

    @Qualifier("menFactory")
    @Autowired
    private IHumanFactory menFactory;

    @Qualifier("womenFactory")
    @Autowired
    private IHumanFactory womenFactory;

    @Resource(name = "xiaoGangMenFactory")
    private IHumanFactory xiaoGangMenFactory;
    @Test
    public void testAbstractFactory(){
        IStudy iStudy = menFactory.doStudy();
        iStudy.doStudy();
        IMakeMoney iMakeMoney = menFactory.doMakeMoney();
        iMakeMoney.makeMoney();

        xiaoGangMenFactory.doStudy().doStudy();
        xiaoGangMenFactory.doMakeMoney().makeMoney();
    }



}

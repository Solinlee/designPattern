package com.solin.designpattern.design.abstractFactory;

import com.solin.designpattern.design.abstractFactory.i.IHumanFactory;
import com.solin.designpattern.design.abstractFactory.i.IMakeMoney;
import com.solin.designpattern.design.abstractFactory.i.IStudy;
import org.springframework.stereotype.Service;

@Service("xiaoGangMenFactory")
public class XiaoGangMenFactoryImpl implements IHumanFactory {
    @Override
    public IStudy doStudy() {
        return new XiaoGangMenStudyImpl();
    }

    @Override
    public IMakeMoney doMakeMoney() {
        return new XiaoGangMenMakeMoneyImpl();
    }
}

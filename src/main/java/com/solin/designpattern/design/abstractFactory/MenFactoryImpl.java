package com.solin.designpattern.design.abstractFactory;

import com.solin.designpattern.design.abstractFactory.i.IHumanFactory;
import com.solin.designpattern.design.abstractFactory.i.IMakeMoney;
import com.solin.designpattern.design.abstractFactory.i.IStudy;
import org.springframework.stereotype.Service;

@Service("menFactory")
public class MenFactoryImpl implements IHumanFactory {
    @Override
    public IStudy doStudy() {
        return new MenStudyImpl();
    }

    @Override
    public IMakeMoney doMakeMoney() {
        return new MenMakeMoneyImpl();
    }
}

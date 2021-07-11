package com.solin.designpattern.design.abstractFactory;

import com.solin.designpattern.design.abstractFactory.i.IHumanFactory;
import com.solin.designpattern.design.abstractFactory.i.IMakeMoney;
import com.solin.designpattern.design.abstractFactory.i.IStudy;
import org.springframework.stereotype.Service;

@Service("womenFactory")
public class WomenFactoryImpl implements IHumanFactory {
    @Override
    public IStudy doStudy() {
        return new WomenStudyImpl();
    }

    @Override
    public IMakeMoney doMakeMoney() {
        return new WomenMakeMoneyImpl();
    }
}

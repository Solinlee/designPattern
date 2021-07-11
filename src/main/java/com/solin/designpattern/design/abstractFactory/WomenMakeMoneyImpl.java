package com.solin.designpattern.design.abstractFactory;

import com.solin.designpattern.design.abstractFactory.i.IMakeMoney;
import org.springframework.stereotype.Service;

@Service("womenMakeMoney")
public class WomenMakeMoneyImpl implements IMakeMoney {
    private String name = "小红";
    @Override
    public void makeMoney() {
        System.out.println(name + "赚钱");
    }
}

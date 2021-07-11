package com.solin.designpattern.design.abstractFactory;

import com.solin.designpattern.design.abstractFactory.i.IMakeMoney;
import org.springframework.stereotype.Service;

@Service("menMakeMoney")
public class MenMakeMoneyImpl implements IMakeMoney {

    private String name = "小明";
    @Override
    public void makeMoney() {
        System.out.println(name + "赚钱啦");
    }
}

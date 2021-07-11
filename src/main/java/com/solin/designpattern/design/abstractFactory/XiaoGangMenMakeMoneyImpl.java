package com.solin.designpattern.design.abstractFactory;

import com.solin.designpattern.design.abstractFactory.i.IMakeMoney;
import org.springframework.stereotype.Service;

@Service("xiaoGangMenMakeMoney")
public class XiaoGangMenMakeMoneyImpl implements IMakeMoney {

    private String name = "小钢";
    @Override
    public void makeMoney() {
        System.out.println(name + "赚钱啦");
    }
}

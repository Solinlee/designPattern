package com.solin.designpattern.design.abstractFactory;

import com.solin.designpattern.design.abstractFactory.i.IStudy;
import org.springframework.stereotype.Service;

@Service("xiaoGangMenStudy")
public class XiaoGangMenStudyImpl implements IStudy {

    private String name = "小钢";

    @Override
    public void doStudy() {
        System.out.println(name + "学习");
    }
}

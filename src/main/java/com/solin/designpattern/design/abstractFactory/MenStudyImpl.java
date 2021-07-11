package com.solin.designpattern.design.abstractFactory;

import com.solin.designpattern.design.abstractFactory.i.IStudy;
import org.springframework.stereotype.Service;

@Service("menStudy")
public class MenStudyImpl implements IStudy {

    private String name = "小明";

    @Override
    public void doStudy() {
        System.out.println(name + "学习");
    }
}

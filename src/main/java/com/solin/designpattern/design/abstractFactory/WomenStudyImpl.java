package com.solin.designpattern.design.abstractFactory;

import com.solin.designpattern.design.abstractFactory.i.IStudy;
import org.springframework.stereotype.Service;

@Service("womenStudy")
public class WomenStudyImpl implements IStudy {
    private String name ="小红";
    @Override
    public void doStudy() {
        System.out.println(name + "学习");
    }
}

package com.solin.designpattern.design.factory;

import com.solin.designpattern.design.factory.i.FactoryBean;
import com.solin.designpattern.design.factory.i.IBean;
import org.springframework.stereotype.Service;

@Service("timeFactory")
public class TimeFactory implements FactoryBean {

    @Override
    public IBean getBean() {
        return new TimeBean("time: today is you last day!");
    }
}

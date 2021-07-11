package com.solin.designpattern.design.factory;

import com.solin.designpattern.design.factory.i.FactoryBean;
import com.solin.designpattern.design.factory.i.IBean;
import org.springframework.stereotype.Service;

@Service("proxyFactory")
public class ProxyFactory implements FactoryBean {

    @Override
    public IBean getBean() {
        return new ProxyBean("proxy: hello word!");
    }
}

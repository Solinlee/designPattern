package com.solin.designpattern.design;

import com.solin.designpattern.design.prototype.PigPrototype;
import com.solin.designpattern.design.prototype.PigPrototypeImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PrototypeTest {

    @Resource(name = "pigPrototype")
    private PigPrototype pigPrototype;

    @Test
    public void testPrototype() {
        System.out.println(pigPrototype.getPigName() + "1");
        Object clone = pigPrototype.clone();
        if (clone instanceof PigPrototypeImpl) {
            System.out.println(((PigPrototypeImpl) clone).getPigName());
        }
    }


}

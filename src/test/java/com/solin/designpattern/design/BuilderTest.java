package com.solin.designpattern.design;

import com.solin.designpattern.design.builder.GeLiDictocter;
import com.solin.designpattern.design.builder.GeLiWasher;
import com.solin.designpattern.design.builder.GeLiWasherBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuilderTest {

    @Resource(name = "geLiWasherBuilder")
    private GeLiWasherBuilder geliWasherBuilder;

    @Test
    public void testBuilder() {
        GeLiDictocter geLiDictocter = new GeLiDictocter(geliWasherBuilder);
        geLiDictocter.construct();
        GeLiWasher geLiWasher = geliWasherBuilder.returnGeliwasher();
        System.out.println("geLiWasher = " + geLiWasher);
    }

}

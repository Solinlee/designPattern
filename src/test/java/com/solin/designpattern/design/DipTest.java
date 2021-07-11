package com.solin.designpattern.design;

import com.solin.designpattern.design.dip.CommonCooker;
import com.solin.designpattern.design.dip.Cook;
import com.solin.designpattern.design.dip.SeniorCooker;
import com.solin.designpattern.design.dip.i.ICook;
import com.solin.designpattern.design.dip.i.IEmployee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DipTest {

    @Qualifier("seniorCooker")
    @Autowired
    private ICook seniorCooker;
    @Qualifier("commonCooker")
    @Autowired
    private ICook commonCooker;

    @Autowired
    private IEmployee iEmployee;

    @Test
    public void testdip(){
//        IEmployee iEmployee = new Cook();
//
//        SeniorCooker seniorCooker = new SeniorCooker();
//        CommonCooker commonCooker = new CommonCooker();
//        System.out.println("iEmployee.cook(seniorCooker) = " + iEmployee.cook(seniorCooker));
//        System.out.println("iEmployee.cook(commonCooker) = " + iEmployee.cook(commonCooker));
        System.out.println("iEmployee.cook(seniorCooker) = " + iEmployee.cook(seniorCooker));
        System.out.println("iEmployee.cook(commonCooker) = " + iEmployee.cook(commonCooker));
    }

}

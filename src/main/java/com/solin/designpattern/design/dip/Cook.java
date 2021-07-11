package com.solin.designpattern.design.dip;

import com.solin.designpattern.design.dip.i.ICook;
import com.solin.designpattern.design.dip.i.IEmployee;
import org.springframework.stereotype.Service;

@Service("cook")
public class Cook implements IEmployee {

    private static final String ice = "干饭";

    @Override
    public String cook(ICook cook) {
        return cook.cookDinner(ice);
    }

}

package com.solin.designpattern.design.dip;

import com.solin.designpattern.design.dip.i.ICook;
import org.springframework.stereotype.Service;

@Service("commonCooker")
public class CommonCooker implements ICook {

    @Override
    public String cookDinner(String food) {
        return "湯泡飯";
    }
}

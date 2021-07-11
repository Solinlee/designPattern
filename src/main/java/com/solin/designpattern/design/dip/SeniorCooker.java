package com.solin.designpattern.design.dip;

import com.solin.designpattern.design.dip.i.ICook;
import org.springframework.stereotype.Service;

@Service("seniorCooker")
public class SeniorCooker implements ICook {
    @Override
    public String cookDinner(String food) {
        return "顆粒分離的蛋炒飯";
    }
}

package com.solin.designpattern.design.prototype;


import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service("pigPrototype")
public class PigPrototypeImpl extends PigPrototype {


    public PigPrototypeImpl() {
        System.out.println("super.getPigName(1) = " + super.getPigName());
        this.setPigName("你是假猪");
        System.out.println("super.getPigName(2) = " + super.getPigName());


    }

}

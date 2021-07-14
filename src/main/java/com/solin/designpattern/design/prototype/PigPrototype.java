package com.solin.designpattern.design.prototype;

import lombok.Data;

@Data
public abstract class PigPrototype implements Cloneable {

    private String pigName;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("无法复制");
        }
        return null;
    }

    PigPrototype() {

    }


}

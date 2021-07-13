package com.solin.designpattern.design.builder;

public class GeLiDictocter {
    private WasherBuilder washerBuilder;

    public GeLiDictocter(WasherBuilder washerBuilder) {
        this.washerBuilder = washerBuilder;
    }

    public void construct() {
        washerBuilder.buildBody();
        washerBuilder.buildCompress();
        washerBuilder.buildWheel();
        washerBuilder.buildColor();
    }

}

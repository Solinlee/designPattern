package com.solin.designpattern.design.builder;


import org.springframework.stereotype.Service;

@Service("geLiWasherBuilder")
public class GeLiWasherBuilder implements WasherBuilder {
    private GeLiWasher geliWasher = new GeLiWasher();

    @Override
    public void buildBody() {
        geliWasher.setBody("美的框架");
    }

    @Override
    public void buildCompress() {
        Compress compress = new Compress();
        compress.setName("西门子压缩机");
        geliWasher.setCompress(compress);

    }

    @Override
    public void buildWheel() {
        geliWasher.setWheel("飞机轮子");
    }

    @Override
    public void buildColor() {
        geliWasher.setColor("太空银");
    }

    public GeLiWasher returnGeliwasher() {
        return geliWasher;
    }
}

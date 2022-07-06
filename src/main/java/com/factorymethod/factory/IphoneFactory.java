package com.factorymethod.factory;

import com.factorymethod.model.Iphone;

public abstract class IphoneFactory {
    public Iphone orderIphone() {
        Iphone device = null;

        device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract Iphone createIPhone();
}

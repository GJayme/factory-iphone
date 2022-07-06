package com.factorymethod.factory;

import com.factorymethod.model.Iphone;
import com.factorymethod.model.Iphone11;

public class Iphone11Factory extends IphoneFactory {
    @Override
    protected Iphone createIPhone() {
        return new Iphone11();
    }
}

package com.factorymethod.factory;

import com.factorymethod.model.Iphone;
import com.factorymethod.model.Iphone11Pro;

public class Iphone11ProFactory extends IphoneFactory{
    @Override
    protected Iphone createIPhone() {
        return new Iphone11Pro();
    }
}

package com.factorymethod.factory;

import com.factorymethod.model.Iphone;
import com.factorymethod.model.IphoneX;

public class IphoneXFactory extends IphoneFactory{
    @Override
    protected Iphone createIPhone() {
        return new IphoneX();
    }
}

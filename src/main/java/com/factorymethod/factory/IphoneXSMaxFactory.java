package com.factorymethod.factory;

import com.factorymethod.model.Iphone;
import com.factorymethod.model.IphoneXSMax;

public class IphoneXSMaxFactory extends IphoneFactory {
    public Iphone createIPhone() {
        return new IphoneXSMax();
    }
}

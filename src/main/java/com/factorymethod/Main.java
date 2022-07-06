package com.factorymethod;

import com.factorymethod.factory.Iphone11ProFactory;
import com.factorymethod.factory.IphoneFactory;
import com.factorymethod.factory.IphoneXFactory;
import com.factorymethod.model.Iphone;

public class Main {
    public static void main(String[] args) {
        IphoneFactory iphoneXFactory = new IphoneXFactory();
        IphoneFactory iphone11ProFactory = new Iphone11ProFactory();

        System.out.println("### Ordering an iPhone X");
        Iphone iphoneX = iphoneXFactory.orderIphone();
        System.out.println(iphoneX);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        Iphone iphone11Pro = iphone11ProFactory.orderIphone();
        System.out.println(iphone11Pro);
    }
}
package com.ligang.designpatterns.factorymethod;

/**
 * 工厂模式
 */

public class Start {

    public static void main(String[] args) {
        Moving moving=new Car();
        moving.going();
    }

}

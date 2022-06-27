package com.ligang.designpatterns.factorymethod;

import com.ligang.designpatterns.factorymethod.Moving;

public class Plane implements Moving {


    @Override
    public void going() {
        System.out.println("Plane going");
    }
}

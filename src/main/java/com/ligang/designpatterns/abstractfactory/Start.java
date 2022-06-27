package com.ligang.designpatterns.abstractfactory;

import com.ligang.designpatterns.group.Food;
import com.ligang.designpatterns.group.Vehicle;
import com.ligang.designpatterns.group.Weapon;
import com.ligang.designpatterns.groupfactory.MagicFactory;
import com.ligang.designpatterns.groupfactory.ModernFactory;

public class Start {
    public static void main(String[] args) {
//        AbstractFactory factory = new MagicFactory();
        AbstractFactory factory = new ModernFactory();
        Food food = factory.creatFood();
        food.printName();
        Vehicle vehicle = factory.creatVehicle();
        vehicle.go();
        Weapon weapon = factory.creatWeapon();
        weapon.shoot();
    }
}

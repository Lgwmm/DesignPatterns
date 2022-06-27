package com.ligang.designpatterns.abstractfactory;

import com.ligang.designpatterns.group.Food;
import com.ligang.designpatterns.group.Vehicle;
import com.ligang.designpatterns.group.Weapon;

public abstract class AbstractFactory {

     public  abstract Food creatFood();
     public abstract Weapon creatWeapon();
     public abstract Vehicle creatVehicle();

}

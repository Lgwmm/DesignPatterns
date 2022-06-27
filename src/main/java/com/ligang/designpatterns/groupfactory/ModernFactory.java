package com.ligang.designpatterns.groupfactory;

import com.ligang.designpatterns.POJO.AK47;
import com.ligang.designpatterns.POJO.Bread;
import com.ligang.designpatterns.POJO.Car;
import com.ligang.designpatterns.abstractfactory.AbstractFactory;
import com.ligang.designpatterns.group.Food;
import com.ligang.designpatterns.group.Vehicle;
import com.ligang.designpatterns.group.Weapon;

/**
 * 现代工厂
 */
public class ModernFactory extends AbstractFactory {

    @Override
     public  Food creatFood() {
        return new Bread();//return 面包
    }

    @Override
    public Weapon creatWeapon() {
        return new AK47();//return AK47
    }

    @Override
    public Vehicle creatVehicle() {
        return new Car();//return 汽车
    }
}

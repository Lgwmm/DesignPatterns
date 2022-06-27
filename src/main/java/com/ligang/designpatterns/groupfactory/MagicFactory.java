package com.ligang.designpatterns.groupfactory;


import com.ligang.designpatterns.POJO.AK47;
import com.ligang.designpatterns.POJO.Broom;
import com.ligang.designpatterns.POJO.MagicStick;
import com.ligang.designpatterns.POJO.MushRoom;
import com.ligang.designpatterns.abstractfactory.AbstractFactory;
import com.ligang.designpatterns.group.Food;
import com.ligang.designpatterns.group.Vehicle;
import com.ligang.designpatterns.group.Weapon;

/**
 * 魔法工厂
 */
public class MagicFactory extends AbstractFactory {


    @Override
    public Food creatFood() {
        return new MushRoom();//return 蘑菇
    }

    @Override
    public Weapon creatWeapon() {
        return new MagicStick();//return 魔法棒
    }

    @Override
    public Vehicle creatVehicle() {
        return new Broom();//return 扫帚
    }
}

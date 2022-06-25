package com.ligang.designpatterns.singleton;

/**
 * 饿汉式加载，还没用到，先加载到内存
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 唯一缺点，不管是否用到，类加载时就完成实例化
 */
public class Mgr01 {

    private static final Mgr01 INSTANCE=new Mgr01();

    private Mgr01(){};

    public static Mgr01 getInstance(){
        return INSTANCE;
    }


    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1==m2);
    }
}

package com.ligang.designpatterns;

/**
 * 枚举单例
 * 不仅可以解决线程同步问题，还可以防止反序列化
 *
 * 反序列化: java反射通过class文件，把类loader到内存，然后反射new instance,得到实例
 *
 * 为什么可以防止反序列化：因为枚举类没有构造方法
 */
public enum Mgr08 {
    INSTANCE;
    Mgr03 mgr03=new Mgr03();

    public static void main(String[] args) {
        for (int i = 0; i <100; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.mgr03.hashCode());
            }).start();
        }
    }
}

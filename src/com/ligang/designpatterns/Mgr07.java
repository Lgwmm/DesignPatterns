package com.ligang.designpatterns;

/**
 * 完美单例之一:静态内部类方式，外部类加载时，内部类不加载
 * 使用静态内部类，当加载Mgr07时，静态内部类Mgr07Loader是不会加载的，只有用到getInstance()时才会加载
 * JVM保证单例：虚拟机加载一个class时，只会加载一次
 */
public class Mgr07 {
    private Mgr07(){}

    //静态内部类
    private static  class Mgr07Loader{
        private final static Mgr07 INSTANCE=new Mgr07();
    }

    public static Mgr07 getInstance(){
        return Mgr07Loader.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <100; i++) {
            new Thread(()->{
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }
    }
}

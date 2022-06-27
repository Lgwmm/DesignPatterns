package com.ligang.designpatterns.singleton;

/**
 * lazy loading
 * 懒汉式加载
 * 再方法加锁虽然实现了只有一个实例，但是每次获取对象时都要去尝试获取锁，那么会降低效率；
 *
 * volatile：禁止指令重排
 */
public class Mgr04 {

    private static volatile Mgr04 INSTANCE;

    private Mgr04(){

    }

    public static synchronized Mgr04 getInstance(){
        if(INSTANCE==null){

            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public void m(String[] args) {
        System.out.println("m");
    }

    /**
     * 多线程验证，存在的线程安全问题
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i <100; i++) {
            new Thread(()->{
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }

}

package com.ligang.designpatterns.singleton;

/**
 * lazy loading
 * 懒汉式加载
 * 双重校验，避免了线程安全问题，仍降低效率；
 */
public class Mgr06 {

    private static Mgr06 INSTANCE;

    private Mgr06(){

    }

    public static synchronized Mgr06 getInstance(){
        if(INSTANCE==null) {
            synchronized (Mgr06.class) {
                if(INSTANCE==null) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }
            }
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
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }

}

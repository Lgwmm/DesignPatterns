package com.ligang.designpatterns;

/**
 * lazy loading
 * 懒汉式加载
 * 判断内部加锁虽然实现单例，但是存在线程安全问题，且效率降低
 */
public class Mgr05 {

    private static Mgr05 INSTANCE;

    private Mgr05(){

    }

    public static synchronized Mgr05 getInstance(){
        if(INSTANCE==null) {
            synchronized (Mgr05.class) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
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
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }

}

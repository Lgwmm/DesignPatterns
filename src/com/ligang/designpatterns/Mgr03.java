package com.ligang.designpatterns;

/**
 * lazy loading
 * 懒汉式加载
 * 最然也做到了单例加载，但是存在线程安全问题
 */
public class Mgr03 {

    private static Mgr03 INSTANCE;

    Mgr03(){

    }

    public static Mgr03 getInstance(){
        if(INSTANCE==null){

            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
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
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }

}

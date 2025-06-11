package org.elliot;

import java.util.Objects;

public class LazyInitialization {

    public volatile static Test INSTANCE=getInstance();

    private static Test getInstance(){
        if(INSTANCE==null){
            synchronized (LazyInitialization.class){
                return Objects.requireNonNullElseGet(INSTANCE, Test::new);
            }
        }else {
            return INSTANCE;
        }
    }
    
    public static void main(String[] args) {
        Test singleton1 = LazyInitialization.INSTANCE;
        Test singleton2= LazyInitialization.INSTANCE;
        System.out.println(singleton1 == singleton2);

    }

    /**
     * 懒汉模式只有在使用的时候才会初始化，注意多线程安全
     */
}

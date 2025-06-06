package org.elliot;

import java.util.Objects;

public class EagerSingleton {

    public volatile static EagerSingleton INSTANCE=getInstance();
    public Integer i=1;

    private static EagerSingleton getInstance(){
        if(INSTANCE==null){
            synchronized (EagerSingleton.class){
                return Objects.requireNonNullElseGet(INSTANCE, EagerSingleton::new);
            }
        }else {
            return INSTANCE;
        }
    }
    
    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.INSTANCE;
        EagerSingleton singleton2= EagerSingleton.INSTANCE;
        System.out.println(singleton1 == singleton2);

    }
}

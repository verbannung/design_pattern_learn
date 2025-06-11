package org.elliot;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class FlyweightFactory {
    //请确保线程安全
    public static final Map<String,Flyweight> flyweightMap = new ConcurrentHashMap<>() {
    };


    public Flyweight getFlyweight(String name){
        return flyweightMap.computeIfAbsent(name, k -> new Flyweight());
    }

}

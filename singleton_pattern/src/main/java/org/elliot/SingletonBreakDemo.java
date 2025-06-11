package org.elliot;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonBreakDemo {
    
    public static void main(String[] args) throws Exception {
        System.out.println("=== 1. 反射破坏测试 ===");
//        testReflectionBreak();
        
        System.out.println("\n=== 2. 序列化破坏测试 ===");
        testSerializationBreak();
        
        System.out.println("\n=== 3. 克隆破坏测试 ===");
        testCloneBreak();
    }
    
    // 1. 反射破坏
    private static void testReflectionBreak() throws Exception {
        Constructor<Test> constructor = Test.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        //反射可以破坏单例模式
        Test instance1 = constructor.newInstance();
        Test instance2 = constructor.newInstance();
        System.out.println(instance1==instance2);
    }
    
    // 2. 序列化破坏
    private static void testSerializationBreak() throws Exception {
        // 演示序列化如何破坏单例
        Test instance1 = EagerInitialization.getInstance();
        instance1.setName("单例对象");
        
        // 序列化
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(instance1);
        oos.close();
        
        // 反序列化
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Test instance2 = (Test) ois.readObject();
        ois.close();
        
        // 比较
        System.out.println("序列化破坏单例: " + (instance1 == instance2));
    }
    
    // 3. 克隆破坏
    private static void testCloneBreak() throws CloneNotSupportedException {
        Test instance1 = EagerInitialization.getInstance();
        Test clone = (Test)instance1.clone();
        System.out.println("克隆破坏单例: " + (instance1 == clone));
    }
}

package org.elliot;

import java.io.*;
import java.lang.reflect.Constructor;

public class SingletonBreakDemo {
    
    public static void main(String[] args) throws Exception {
        System.out.println("=== 1. 反射破坏测试 ===");
        testReflectionBreak();
        
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
        Test instance = constructor.newInstance();
    }
    
    // 2. 序列化破坏
    private static void testSerializationBreak() throws Exception {
        // 需要实现 Serializable 接口才能测试
        System.out.println("序列化破坏需要类实现 Serializable 接口");
        System.out.println("饿汉式/懒汉式/静态内部类: 可被破坏（需添加 readResolve 方法防御）");
        System.out.println("枚举: 自动防止序列化破坏");
    }
    
    // 3. 克隆破坏
    private static void testCloneBreak() {

    }
}

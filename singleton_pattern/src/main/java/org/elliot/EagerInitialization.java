package org.elliot;

public class EagerInitialization {

    private static final Test INSTANCE = new Test();

    public static Test getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Test instance1 = getInstance();
        Test instance2 = getInstance();
        System.out.println(instance1 == instance2);
    }

    /**
     * 饿汉模式在类的初始化时进行实例化
     *
     */
}

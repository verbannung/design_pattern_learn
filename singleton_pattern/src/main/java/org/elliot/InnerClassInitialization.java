package org.elliot;

public class InnerClassInitialization {

    private static class InnerClass {
        private static final Test INSTANCE = new Test();
    }

    public static Test getInstance() {
        return InnerClassInitialization.InnerClass.INSTANCE;
    }

    public static void main(String[] args) {
        Test instance1 = getInstance();
        Test instance2 = getInstance();
        System.out.println(instance1 == instance2);

    }

    /*
       静态内部类的加载也是延迟的
     */
}

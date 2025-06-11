package org.elliot;

public enum EnumInitialization {
    INSTANCE;

    private final Test test = new Test();

    public Test getTest() {
        return test;
    }

    public void doSomething() {
        System.out.println("Doing something in enum singleton");
    }

    public static void main(String[] args) {
        EnumInitialization instance1 = EnumInitialization.INSTANCE;
        EnumInitialization instance2 = EnumInitialization.INSTANCE;
        System.out.println(instance1 == instance2);
        
        Test test1 = instance1.getTest();
        Test test2 = instance2.getTest();
        System.out.println(test1 == test2);
    }

    /**
     * 枚举依赖jvm实现，本身线程安全
     */
}

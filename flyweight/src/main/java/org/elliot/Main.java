package org.elliot;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("你好");
        Flyweight flyweight2 = factory.getFlyweight("你好");
        System.out.println(flyweight1==flyweight2);
    }
}
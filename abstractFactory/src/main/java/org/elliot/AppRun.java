package org.elliot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class AppRun {
    /**
     * 使用工厂模式的好处
     * 1.创造产品族容易
     * 2.隔离创造产品的行为，便于控制
     *
     */
    public static void main(String[] args) {
        //这里应该纳入springboot bean管理的两个工厂
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();

        AbstractProductA productA1 = getProductA(concreteFactory1);
        AbstractProductB productB1 = getProductB(concreteFactory1);

        AbstractProductA productA2 = getProductA(concreteFactory2);
        productA1.doSomething();
        productA2.doSomething();
        productB1.doSomething();

    }

    public static AbstractProductA getProductA(AbstractFactory factory){
        return factory.createProductA();
    }

    public static AbstractProductB getProductB(AbstractFactory factory){
        return factory.createProductB();
    }
}

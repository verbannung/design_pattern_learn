package org.elliot;

import org.elliot.domain.ProductA1;
import org.elliot.domain.ProductB1;
import org.springframework.stereotype.Component;

//@Component
public class ConcreteFactory1 extends AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}

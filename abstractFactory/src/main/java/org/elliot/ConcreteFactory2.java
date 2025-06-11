package org.elliot;

import org.elliot.domain.ProductA1;
import org.elliot.domain.ProductA2;
import org.elliot.domain.ProductB1;

//@Component
public class ConcreteFactory2 extends AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

}

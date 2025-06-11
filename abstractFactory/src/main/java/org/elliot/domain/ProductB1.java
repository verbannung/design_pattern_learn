package org.elliot.domain;

import lombok.Data;
import org.elliot.AbstractProductB;

@Data
public class ProductB1 extends AbstractProductB {
    private String name="ProductB1";

    @Override
    public void doSomething() {
        System.out.println("ProductB1 doSomething");
    }
}

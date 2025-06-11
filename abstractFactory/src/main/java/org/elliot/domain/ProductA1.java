package org.elliot.domain;

import lombok.Data;
import org.elliot.AbstractProductA;

@Data
public class ProductA1 extends AbstractProductA {
    private String name="ProductA1";

    @Override
    public void doSomething() {
        System.out.println("ProductA1 doSomething");
    }
}

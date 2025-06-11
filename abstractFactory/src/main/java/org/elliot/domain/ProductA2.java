package org.elliot.domain;

import lombok.Data;
import org.elliot.AbstractProductA;

@Data
public class ProductA2 extends AbstractProductA {
    private String name="ProductA2";

    @Override
    public void doSomething() {
        System.out.println("ProductA2 doSomething");
    }
}

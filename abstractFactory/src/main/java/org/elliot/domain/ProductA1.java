package org.elliot.domain;

import lombok.Data;

@Data
public class ProductA1 {
    private String name="ProductA";

    public void doSomething() {
        System.out.println("ProductA doSomething");
    }
}

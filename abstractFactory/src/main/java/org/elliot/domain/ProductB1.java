package org.elliot.domain;

import lombok.Data;

@Data
public class ProductB1 {
    private String name="ProductB";

    public void doSomething() {
        System.out.println("ProductB doSomething");
    }
}

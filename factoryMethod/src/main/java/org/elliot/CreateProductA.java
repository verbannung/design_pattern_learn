package org.elliot;

import org.elliot.domain.ProductA;

public class CreateProductA extends Creator{

    @Override
    public Object createProduct() {
        return ProductA.builder().build();
    }
}

package org.elliot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

@Data

public class Product implements Copy,Cloneable{

    private String name="product";
    private Integer age;

    @Override
    @SuppressWarnings("unchecked")
    public Product deepCopy() throws JsonProcessingException {
        ObjectMapper objectMapper=new ObjectMapper();
        String json = objectMapper.writeValueAsString(this);
        return objectMapper.readValue(json,this.getClass());
    }


    @Override
    public Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }
}

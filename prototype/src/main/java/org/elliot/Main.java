package org.elliot;

import com.fasterxml.jackson.core.JsonProcessingException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, JsonProcessingException {
        Product product1=new Product();
        Product clone = product1.clone();
        System.out.println(clone==product1);
        Product deepClone=product1.deepCopy();
        System.out.println(deepClone==product1);
    }
}
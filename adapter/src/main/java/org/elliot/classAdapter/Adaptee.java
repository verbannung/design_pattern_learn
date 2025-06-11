package org.elliot.classAdapter;

import lombok.Data;

@Data
public class Adaptee {
    private  String name="Adaptee";

    public void changeName(){
        System.out.println( "Adaptee changeName");
    }
}

package org.elliot.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Dept implements Operation{
    private String name;

    public Dept(String name){
        this.name=name;
    }

    private List<Dept> depts=new ArrayList<>();


    @Override
    public void add(Dept dept){
        depts.add(dept);
    }

    @Override
    public void remove(Dept dept){
        depts.remove(dept);
    }

}

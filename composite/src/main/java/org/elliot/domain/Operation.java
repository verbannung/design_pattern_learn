package org.elliot.domain;

public interface Operation {
     void add(Dept dept);

     void remove(Dept dept);

     void display(int depth);

     String duty();
}

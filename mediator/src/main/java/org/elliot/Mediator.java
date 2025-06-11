package org.elliot;

public class Mediator {

    private final Colleague colleagueA=new ColleagueA();

    private final Colleague colleagueB=new ColleagueB();


    public void coordinationAAndB(){
        colleagueA.getName();
        colleagueB.getName();
    }

}

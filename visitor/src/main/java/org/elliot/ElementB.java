package org.elliot;

public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("ElementB doSomething");
    }
}

package org.elliot;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("ElementA doSomething");
    }
}

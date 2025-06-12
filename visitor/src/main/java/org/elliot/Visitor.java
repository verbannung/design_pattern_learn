package org.elliot;

public class Visitor {

    public void visit(ElementA element){
        element.accept(this);
    }

    public void visit(ElementB element){
        element.accept(this);
    }
}

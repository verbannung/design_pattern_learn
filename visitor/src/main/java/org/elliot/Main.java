package org.elliot;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        visitor.visit(new ElementA());
        visitor.visit(new ElementB());
    }

    //如果不使用访问者模式，容易写出这种

    public void exchange(Element element){
        if(element instanceof ElementA){
            System.out.println("doSomething");
        }else if(element instanceof ElementB){
            System.out.println("doSomething");
        }
    }

    //jdk21模式匹配
    public void exchange2(Element element){
        switch (element){
            case ElementA a -> a.accept(new Visitor());
            case ElementB b -> b.accept(new Visitor());
            case null -> System.out.println("Element is null");
            default -> throw new IllegalArgumentException("Unknown element type: " + element.getClass());
        }
    }
}
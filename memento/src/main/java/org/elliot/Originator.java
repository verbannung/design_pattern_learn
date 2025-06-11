package org.elliot;

public class Originator {
    private String state;
    
    public void setState(String state) {
        this.state = state;
        System.out.println("设置状态为: " + state);
    }
    
    public String getState() {
        return state;
    }
    
    public Memento createMemento() {
        return new Memento(state);
    }
    
    public void restoreFromMemento(Memento memento) {
        this.state = memento.getState();
        System.out.println("恢复状态为: " + state);
    }
}
package org.elliot;

import lombok.Data;

@Data
public class Context {
    private final State stateA=new StateA();
    private final State stateB=new StateB();

    private State state;
    
    public Context() {
        // 默认初始状态
        this.state = new StateA();
    }
    
    public void action1() {
        state.action1(this);
    }
    
    public void action2() {
        state.action2(this);
    }
}

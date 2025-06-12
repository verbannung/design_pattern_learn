package org.elliot;

public class StateB implements State {
    @Override
    public void action1(Context context) {
        System.out.println("StateB: 执行action1");
        // 保持当前状态
    }

    @Override
    public void action2(Context context) {
        System.out.println("StateB: 执行action2");
        // 状态转换: B -> A
        context.setState(new StateA());
        System.out.println("状态已切换到StateA");
    }
}

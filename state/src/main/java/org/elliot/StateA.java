package org.elliot;

public class StateA implements State {
    @Override
    public void action1(Context context) {
        System.out.println("StateA: 执行action1");
        // 状态转换: A -> B
        context.setState(context.getStateB());
        System.out.println("状态已切换到StateB");
    }

    @Override
    public void action2(Context context) {
        System.out.println("StateA: 执行action2");
        // 保持当前状态
    }
}

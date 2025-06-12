package org.elliot;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 状态模式演示 ===\n");
        
        // 创建上下文
        Context context = new Context();
        
        // 初始状态是StateA
        System.out.println("初始状态: StateA");
        
        // 执行action1，会从StateA切换到StateB
        context.action1();
        
        System.out.println("\n--- 当前状态: StateB ---");
        
        // 在StateB中执行action1
        context.action1();
        
        // 在StateB中执行action2，会切换回StateA
        context.action2();
        
        System.out.println("\n--- 当前状态: StateA ---");
        
        // 再次执行action2
        context.action2();
    }
}
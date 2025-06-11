package org.elliot;

public class Main {
    public static void main(String[] args) {
        // 创建原发器和管理者
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        
        System.out.println("=== 备忘录模式演示（支持分支） ===\n");
        
        // 在主分支上进行操作
        System.out.println("--- 主分支操作 ---");
        originator.setState("状态1");
        caretaker.add(originator.createMemento());
        
        originator.setState("状态2");
        caretaker.add(originator.createMemento());
        
        originator.setState("状态3");
        caretaker.add(originator.createMemento());
        
        System.out.println("当前状态: " + originator.getState());
        System.out.println("主分支历史记录数: " + caretaker.getHistorySize());
        
        // 创建新分支
        System.out.println("\n--- 创建并切换到feature分支 ---");
        caretaker.createBranch("feature");
        caretaker.switchBranch("feature");
        
        // 在feature分支上操作
        originator.setState("feature-状态1");
        caretaker.add(originator.createMemento());
        
        originator.setState("feature-状态2");
        caretaker.add(originator.createMemento());
        
        System.out.println("当前状态: " + originator.getState());
        System.out.println("feature分支历史记录数: " + caretaker.getHistorySize());
        
        // 回退操作
        System.out.println("\n--- 在feature分支上执行撤销 ---");
        Memento previousState = caretaker.undo();
        if (previousState != null) {
            originator.restoreFromMemento(previousState);
        }
        
        // 切换回主分支
        System.out.println("\n--- 切换回主分支 ---");
        caretaker.switchBranch("main");
        
        // 恢复主分支的最后状态
        Memento mainBranchState = caretaker.get(caretaker.getHistorySize() - 1);
        if (mainBranchState != null) {
            originator.restoreFromMemento(mainBranchState);
        }
        
        // 显示所有分支
        System.out.println("\n--- 所有分支 ---");
        System.out.println("分支列表: " + caretaker.getBranches());
        System.out.println("当前分支: " + caretaker.getCurrentBranch());
    }
}
package org.elliot;

import java.util.*;

public class Caretaker {
    // 使用Map存储不同分支的历史记录
    private final Map<String, List<Memento>> branches = new HashMap<>();
    private String currentBranch = "main";
    
    public Caretaker() {
        // 初始化主分支
        branches.put("main", new ArrayList<>());
    }
    
    // 添加备忘录到当前分支
    public void add(Memento memento) {
        branches.get(currentBranch).add(memento);
    }
    
    // 获取当前分支的特定版本
    public Memento get(int index) {
        List<Memento> history = branches.get(currentBranch);
        if (index >= 0 && index < history.size()) {
            return history.get(index);
        }
        return null;
    }
    
    // 撤销操作
    public Memento undo() {
        List<Memento> history = branches.get(currentBranch);
        if (history.size() > 1) {
            history.remove(history.size() - 1);
            return history.get(history.size() - 1);
        }
        return null;
    }
    
    // 创建新分支
    public void createBranch(String branchName) {
        if (!branches.containsKey(branchName)) {
            // 复制当前分支的历史到新分支
            List<Memento> currentHistory = branches.get(currentBranch);
            branches.put(branchName, new ArrayList<>(currentHistory));
        }
    }
    
    // 切换分支
    public void switchBranch(String branchName) {
        if (branches.containsKey(branchName)) {
            currentBranch = branchName;
            System.out.println("切换到分支: " + branchName);
        }
    }
    
    // 获取当前分支历史记录数量
    public int getHistorySize() {
        return branches.get(currentBranch).size();
    }
    
    // 获取所有分支名称
    public Set<String> getBranches() {
        return branches.keySet();
    }
    
    // 获取当前分支名
    public String getCurrentBranch() {
        return currentBranch;
    }
}

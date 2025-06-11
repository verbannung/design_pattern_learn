package org.elliot.domain;

public class HrDept extends Dept{
    @Override
    public void display(int depth) {
        for(int i=0;i<depth;i++){
            System.out.print("-");
        }
        System.out.println(duty());
    }

    public HrDept() {
        super("人事部门");
    }

    @Override
    public String duty() {
        return getName();
    }
}

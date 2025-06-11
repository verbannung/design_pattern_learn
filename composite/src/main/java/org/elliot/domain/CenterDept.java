package org.elliot.domain;

public class CenterDept extends Dept{

    @Override
    public void display(int depth) {
        for(int i=0;i<depth;i++){
            System.out.print("-");
        }
        System.out.println(duty());
        for(Dept dept:getDepts()){
            dept.display(depth+1);
        }
    }

    public CenterDept() {

        super("总部门");
    }

    @Override
    public String duty() {
        return getName();
    }
}

package org.elliot;

import org.elliot.domain.CenterDept;
import org.elliot.domain.HrDept;
import org.elliot.domain.TechDept;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CenterDept centerDept = new CenterDept();
        centerDept.add(new HrDept());
        centerDept.add(new TechDept());

        centerDept.display(1);
    }
}
package org.elliot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            String next = iterator1.next();
            if("A".equals(next)) {
                iterator1.remove();
            }
        }

        Iterator<String> iterator2 = list.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
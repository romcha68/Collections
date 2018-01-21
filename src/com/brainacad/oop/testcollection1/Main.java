package com.brainacad.oop.testcollection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main (String[] args){
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add("number_" + i);
        }

        System.out.println("First:\n" + list);

        System.out.println("Second:");
        for(int i =0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\nThird:");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\nFourth:");
        for(String string : list) {
            System.out.print(string + " ");
        }
    }
}

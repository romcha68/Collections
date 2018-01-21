package com.brainacad.oop.testcollection2;

import java.util.*;

public class Main {
    public static void main (String[] args){
        List<String> list = new LinkedList<>();

        Random random = new Random();

        for(int i = 0; i < 10; i++){
            list.add(random.nextInt(i+1), "num_" + i);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

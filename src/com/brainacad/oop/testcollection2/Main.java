package com.brainacad.oop.testcollection2;

import java.util.*;

public class Main {
    public static void main (String[] args){
        List<String> list = new LinkedList<>();

        Random random = new Random();

        for(int i = 0; i < 10; i++){
            int index = random.nextInt(i+1);
            while (true){
                int element = random.nextInt(11);
                if(!list.contains(Integer.toString(element))){
                    list.add(index,Integer.toString(element));
                    break;
                }
            }
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

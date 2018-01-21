package com.brainacad.oop.testcollection3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add("num_" + i);
            linkedList.add("num_" + i);
        }

        System.out.println("First step:");
        System.out.println("\tArray List: \n\t\t" + arrayList);
        System.out.println("\tLinked List: \n\t\t" + linkedList);

        ListIterator arrayIterator = arrayList.listIterator();
        ListIterator linkedIterator = linkedList.listIterator();

        while (linkedIterator.hasNext()) {
            if (arrayIterator.hasNext()) {
                linkedIterator.add(arrayIterator.next());
            }
            linkedIterator.next();
        }

        System.out.println("Second step:");
        System.out.println("\tArray List: \n\t\t" + arrayList);
        System.out.println("\tLinked List: \n\t\t" + linkedList);

        arrayIterator = arrayList.listIterator();
        while (linkedIterator.hasPrevious()) {
            linkedIterator.previous();
            if (arrayIterator.hasNext()) {
                linkedIterator.add(arrayIterator.next());
            }
            linkedIterator.previous();
            linkedIterator.previous();
        }

        System.out.println("Third step:");
        System.out.println("\tArray List: \n\t\t" + arrayList);
        System.out.println("\tLinked List: \n\t\t" + linkedList);
    }
}

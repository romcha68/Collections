package com.brainacad.oop.testcollection5;

/**
 * Created by User on 31.01.2018.
 */
public class Main {
    public static void main(String[] args){
        MyNumGenerator myNumGenerator = new MyNumGenerator(5,64);
        System.out.println("MyNumGenerator:\n\t" + myNumGenerator.generateDistinct());
    }
}

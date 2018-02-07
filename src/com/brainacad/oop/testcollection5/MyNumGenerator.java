package com.brainacad.oop.testcollection5;

import java.util.*;

/**
 * Created by User on 31.01.2018.
 */
public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List generate(){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < numOfElm; i++){
            list.add(random.nextInt(maxNumb));
        }
        return list;
    }

    public Set generateDistinct(){
        HashSet<Integer> set = new HashSet <>();
        Random random = new Random();
        while (set.size() < numOfElm){
                set.add(random.nextInt(maxNumb));
        }
        return set;
    }

}


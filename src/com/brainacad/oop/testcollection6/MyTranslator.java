package com.brainacad.oop.testcollection6;

import java.util.HashMap;

/**
 * Created by User on 07.02.2018.
 */
public class MyTranslator {
    private HashMap<String,String> dictionary = new HashMap<>();

    public void addNewWord(String en, String ru){
        dictionary.put(en,ru);
    }
    public String translate(String en){
        return dictionary.get(en);
    }
}

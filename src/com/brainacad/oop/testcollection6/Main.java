package com.brainacad.oop.testcollection6;

import java.util.Scanner;

/**
 * Created by User on 07.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        MyTranslator myTranslator = new MyTranslator();

        myTranslator.addNewWord("cat", "кот");
        myTranslator.addNewWord("mouse", "мышь");
        myTranslator.addNewWord("caught", "поймал");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст на английском:\n\t");
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        System.out.print("Перевод:\n\t");
        for(String word: words){
            System.out.print(myTranslator.translate(word) + " ");
        }

    }
}

package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("watermelon");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("watermelon");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("watermelon");

        HashMap<String, Integer> wordList =  new HashMap<>();
        for (String i : fruits){
            wordList.put(i, wordList.getOrDefault(i, 0) + 1);
        }

        System.out.println(wordList.entrySet());


    }
}
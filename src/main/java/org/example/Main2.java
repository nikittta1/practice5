package org.example;

import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();


        phoneBook.add("Лавров", "123-456");
        phoneBook.add("Петров", "789-012");
        phoneBook.add("Сидоров", "455-123");
        phoneBook.add("Петров", "123-123");
        phoneBook.add("Сидоров", "123-123");
        phoneBook.add("Сидоров", "123-456");


        phoneBook.print();

        System.out.println();
        phoneBook.get("Лавров");



    }
}

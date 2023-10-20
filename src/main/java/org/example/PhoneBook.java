package org.example;

import java.util.*;

public class PhoneBook {
    private TreeMap<String, LinkedHashSet <String>> phoneBook =new TreeMap<>();




    public void add(String surname, String number) {
        for (Map.Entry<String, LinkedHashSet<String>> entry : phoneBook.entrySet()) {
            LinkedHashSet<String> phoneNumbers = entry.getValue();
            if (phoneNumbers.contains(number)) {

                phoneNumbers.remove(number);

                if (phoneNumbers.isEmpty()) {
                    phoneBook.remove(entry.getKey());
                }
                break;
            }
        }

        // Добавляем номер к новой фамилии
        if (phoneBook.containsKey(surname)) {
            LinkedHashSet<String> phoneNumbers = phoneBook.get(surname);
            phoneNumbers.add(number);
        } else {
            LinkedHashSet<String> phoneNumbers = new LinkedHashSet<>();
            phoneNumbers.add(number);
            phoneBook.put(surname, phoneNumbers);
        }
    }
    public void get(String surname){
        if (phoneBook.containsKey(surname)){
            Set<Map.Entry<String, LinkedHashSet <String>>> set = phoneBook.entrySet();
            for (Map.Entry<String, LinkedHashSet <String>> item: set) {
                if(item.getKey().equals(surname)){
                    System.out.println(item.getKey() + ", номер: " + item.getValue());
                }
            }
        } else {
            System.out.format("Фамилия не найдена");
            System.out.println();
        }

    }

    public void print(){
        for(Map.Entry<String, LinkedHashSet <String>> o: phoneBook.entrySet()){
            System.out.println(o);
        }
    }
}




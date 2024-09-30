package org.example.task4;

public class TestTask4 {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(5);

        dictionary.set("apple", "A fruit");
        dictionary.set("banana", "Another fruit");

        System.out.println(dictionary.get("apple")); // Вывод: A fruit
        System.out.println(dictionary.get("banana")); // Вывод: Another fruit
        System.out.println(dictionary.get("orange")); // Вывод: null

        dictionary.set("apple", "A sweet fruit");
        System.out.println(dictionary.get("apple")); // Вывод: A sweet fruit

    }
}

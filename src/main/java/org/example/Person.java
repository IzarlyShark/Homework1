package org.example;
/*Создать класс Person с полями int age, String name и 3 конструктора (имя+возраст, имя,возраст)
 - не забыть про this или параметрам конструктора дать другие имена.
 Если для поля не передается значение  в конструктор, то задать в конструкторе свое
 (например имя билли по умолчанию или возраст 18). Создать 3 экземпляра(обьекта) и
продемонстрировать их работу (вывести поля созданных обьектов) */
public class Person {
    int age;
    private String name;

   public static int counter;
    Person() {
        this (18, "Billy");
    }

    public String getName(){
        return this.name;
    }

    public void  helloFriend(Person p) {
        System.out.println("Мой друг " + p.getName());
    }
    Person (int age) {
        this.age = age;
        counter++;
    }

    Person(String name) {
        this.name = name;
        counter++;
    }

    Person(int age, String name) {
        this.age = age;
        this.name = name;
        counter++;
    }

    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
        System.out.println(Person.counter);
    }

}

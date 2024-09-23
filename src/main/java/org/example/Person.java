package org.example;
/*Создать класс Person с полями int age, String name и 3 конструктора (имя+возраст, имя,возраст)
 - не забыть про this или параметрам конструктора дать другие имена.
 Если для поля не передается значение  в конструктор, то задать в конструкторе свое
 (например имя билли по умолчанию или возраст 18). Создать 3 экземпляра(обьекта) и
продемонстрировать их работу (вывести поля созданных обьектов) */
public class Person {
    int age;
    String name;

    {
        name = "Billy";
        age = 18;
    }

    /*начало блока инициализатора*/
    /*{
        name = "Billy";
        age = 18;
    }*/
    Person() {
        this (18, "Billy");
    }

    Person (int age) {
        this.age = age;
    }

    Person(String name) {
        this.name = name;
    }

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }

}

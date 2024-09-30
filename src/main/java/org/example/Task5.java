package org.example;

public class Task5 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person(17);
        Person person3 = new Person("Sam");
        Person person4 = new Person(25, "Hilary");

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
        person4.displayInfo();
        person1.helloFriend(person3);
    }
}

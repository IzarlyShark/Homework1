package org.example;
import java.util.Arrays;
/*Создать массив на 5 имен (строки) names и пустой массив на 5 обьектов Person.
Заполнить массив  людей и задать возраст из массива ages:
persons[i] = new Person(names[i])*/
public class Task6 {
    public static void main(String[] args) {
        String[] names = new String[] {"Billy", "Hilary", "Sam", "Kate", "Jack"};
        System.out.println(Arrays.toString(names));
        int[] ages = new int[] {12, 25, 40, 67, 15};
        System.out.println(Arrays.toString(ages));
        Person[] persons = new Person[5];
        System.out.println(Arrays.toString(persons));
        for (int i = 0; i < names.length; i++) {
            persons[i] = new Person(ages[i], names[i]);
        }

        for (Person person : persons) {
            person.displayInfo();
        }
    }
}

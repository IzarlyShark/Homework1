package org.example;
/*1)Вывести числа на экран от 1 до 100 с помощью цикла for,
потом  от 100 до 1 с помощью другого цикла for */
public class Task1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

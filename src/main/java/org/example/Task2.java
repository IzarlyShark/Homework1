package org.example;
/* Вывести числа на экран от 1 до 100 с помощью цикла while,
потом  от 100 до 1 с помощью другого цикла while  */
public class Task2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        int j = 100;
        while (j > 0) {
            System.out.println(j);
            j--;
        }
    }
}

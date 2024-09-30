package org.example;
import java.util.Random;
/*Вывести 5 случайных чисел
(цикл + на каждой итерации вызываем метод обьекта Random - обьект рандом создать выше цикла)*/
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            int randomInt = random.nextInt(9) +1;
            System.out.println(randomInt);
        }
    }
}

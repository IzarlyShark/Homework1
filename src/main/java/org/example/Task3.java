package org.example;
/* Перебрать в цикле for цисла от 1 до 30 и вывести для каждого четно это число или нет */
public class Task3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - this is an even number");
            }
            else {
                System.out.println(i + " - this is an odd number");
            }
        }
    }
}

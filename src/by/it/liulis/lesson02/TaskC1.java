package by.it.liulis.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Ввод:");
        System.out.println(x + " " + y);
        System.out.println("Вывод:");
        System.out.println("Sum = " + sum(x, y));
    }

    public static int sum(int x, int y) {
        return x + y;
    }


}

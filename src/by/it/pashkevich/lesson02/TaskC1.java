package by.it.pashkevich.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        System.out.println("Введите число: ");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("Sum" + " " + "=" + " " + sum);
    }



}

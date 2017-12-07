package by.it.buslo.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
import java.sql.SQLOutput;
import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a, b;
a = sc.nextInt();
b = sc.nextInt();
System.out.println("Ввод:");
System.out.println( + a +" " + b);
int c = a + b;
        System.out.println("Вывод:");
        System.out.println("Sum = "  + c);

    }


}

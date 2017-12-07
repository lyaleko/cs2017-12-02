package by.it.aternovski.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
import java.util.Scanner;
class TaskC1 {
    public static void main (String [] args){
        System.out.println("Введите пожалуйста два целых числа от 1 до 99");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        //int n3 = n1 + n2;
        System.out.println("Sum = " + (n1+n2) );
    }



}

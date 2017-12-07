package by.it.mlech.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main (String args[]){
        Scanner scr = new Scanner(System.in);
        int[] c = new int[3];
        c[0] = scr.nextInt();
        c[1] = scr.nextInt();
        c[2] = c[0]+c[1];


        System.out.println("Ввод:");
        System.out.println(c[0]+" "+c[1]);
        System.out.println();
        System.out.println("Вывод:");
        System.out.println("Sum = "+c[2]);

    }
}

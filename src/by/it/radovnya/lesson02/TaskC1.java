package by.it.radovnya.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void  main (String[] args ){
        Scanner s =new Scanner(System.in);
        System.out.println("Vvedite  chisla: ");
        int k = s.nextInt();
        int f = s.nextInt();
                System.out.println("Sum = " +(k+f));
    }



}

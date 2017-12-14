package by.it.lippert.lesson05;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        System.out.println("Enter 20 numbers: ");
        Scanner sc = new Scanner(System.in);
        int m[] = new int[20];
        int x[] = new int[10];
        int y[] = new int[10];
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
            x = Arrays.copyOfRange(m, 0, 10);
            y = Arrays.copyOfRange(m, 10, 20);
        }
        System.out.println("a=" + Arrays.toString(x));
        System.out.println("b=" + Arrays.toString(y));


    }
}

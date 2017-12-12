package by.it.niehaj.lesson03;

/*
Lesson 04. Task A1. Калькулятор.
Напишите программу, которая считывает с клавиатуры два целых числа a и b
после этого выводит через пробел:

сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (результат выводится как тип int).

после этого еще раз выводит через пробел
сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (но результат выводится как тип double).

Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.
Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. В программе необходимо создать объект типа Scanner.
2. Программа должна считывать два числа типа int с клавиатуры.
3. Программа должна дважды выводить в строку пять чисел через пробел.
4. Программа должна выводить int сумму, разность, произведение, частное и отстаток от деления этих чисел двух чисел.
4. Программа должна выводить double сумму, разность, произведение, частное и отстаток от деления этих чисел двух чисел.

Пример:

Ввод:
7 2
Вывод:
9 5 14 3 1
9.0 5.0 14.0 3.5 1.0

 */


import java.util.Scanner;

class TaskA1 {

    int x, y;
    double a, b;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввод:");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int isum = x + y;
        int idif = x - y;
        int imult = x * y;
        int idiv = x / y;
        int idiv_rem = x % y;

        System.out.println();
        System.out.println("Вывод:");
        System.out.println(isum + " " + idif + " " + imult + " " + idiv + " " + idiv_rem);

        double a = x;
        double b = y;

        double dsum = a + b;
        double ddif = a - b;
        double dmult = a * b;
        double ddiv = a / b;
        double ddiv_rem = a % b;
        System.out.println(dsum + " " + ddif + " " + dmult + " " + ddiv + " " + ddiv_rem);

    }
}
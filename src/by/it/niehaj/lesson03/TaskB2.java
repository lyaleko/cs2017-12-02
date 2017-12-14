package by.it.niehaj.lesson03;

import java.util.Scanner;

/*
Lesson 04. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {

    public static void main(String[] args) {

        System.out.println("Ввод:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Вывод:");

        if (dis(a,b,c)>0) {
            double x_pos = ((-b) + (Math.sqrt(dis(a, b, c)))) / (2 * a);
            double x_neg = ((-b) - (Math.sqrt(dis(a, b, c)))) / (2 * a);
            System.out.println(x_pos + " " + x_neg);
        }

        else if (dis(a,b,c) == 0) {
            double x_pos = ((-b) + (Math.sqrt(dis(a, b, c)))) / (2 * a);
            System.out.println(x_pos);
        }

        else if (dis(a,b,c) < 0) {
            System.out.println("Отрицательный дискриминант");
        }

        System.out.println();
    }

    public static double dis(double a, double b, double c) {
        double d = ((b*b) - (4*a*c)) ;
        return d;
    }
}
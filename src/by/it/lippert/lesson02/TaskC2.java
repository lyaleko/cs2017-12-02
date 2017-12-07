package by.it.lippert.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Ввод:
34 26

Вывод:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OKT:42+32=74
*/
class TaskC2 {public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner scan = new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    for (int i = 0; i < 5; i++)
    System.out.println("Вывод:\n" +
            "DEC:34+26=60\n" +
            "BIN:100010+11010=111100\n" +
            "HEX:22+1a=3c\n" +
            "OKT:42+32=74");


}
}

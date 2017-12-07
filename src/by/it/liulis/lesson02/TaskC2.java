package by.it.liulis.lesson02;

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
class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Ввод:");
        System.out.println(x + " " + y);
        System.out.println("");
        showConvert(x, y);

    }

    public static void showConvert(int x, int y) {
        System.out.println("Вывод:");
        System.out.println("DEC:" + x + "+" + y + "=" + (x + y));
        System.out.println("BIN:" + Integer.toBinaryString(x) + "+" + Integer.toBinaryString(y) + "=" + Integer.toBinaryString(x + y));
        System.out.println("HEX:" + Integer.toHexString(x) + "+" + Integer.toHexString(y) + "=" + Integer.toHexString(x + y));
        System.out.println("OKT:" + Integer.toOctalString(x) + "+" + Integer.toOctalString(y) + "=" + Integer.toOctalString(x + y));
    }
}

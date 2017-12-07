package by.it.pashkevich.lesson02;

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


import java.util.Scanner;

class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        String convert = Integer.toBinaryString(a).toUpperCase();
        String convert2 = Integer.toBinaryString(b);
        String convert3 = Integer.toBinaryString(sum);
        String hex = Integer.toHexString(a);
        String hex2 = Integer.toHexString(b);
        String hex3 = Integer.toHexString(sum);
        String octal = Integer.toOctalString(a);
        String octal2 = Integer.toOctalString(b);
        String octal3 = Integer.toOctalString(sum);
        System.out.println("DEC:" + a + "+" + b + "=" + sum);
        System.out.println("BIN:" + convert + "+" + convert2 + "=" + convert3);
        System.out.println("HEX:" + hex + "+" + hex2 + "=" + hex3);
        System.out.println("OKT:" + octal + "+" + octal2 + "=" + octal3);
    }
}

package by.it.radovnya.lesson02;

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
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a+b;
        String B1 = Integer.toBinaryString(a);
        String B2 = Integer.toBinaryString(b);
        String B =  Integer.toBinaryString(sum);
        String H1 = Integer.toHexString(a);
        String H2 = Integer.toHexString(b);
        String H = Integer.toHexString(sum);
        String O1 = Integer.toOctalString(a);
        String O2 = Integer.toOctalString(b);
        String O = Integer.toOctalString(sum);
        System.out.println("DEC:" + a + "+" + b + "=" + sum);
        System.out.println("BIN:" + B1 + "+" + B2 + "=" + B);
        System.out.println("HEX:" + H1 + "+" + H2 + "=" + H);
        System.out.println("OKT:" + O1 + "+" + O2 + "=" + O);

}
}

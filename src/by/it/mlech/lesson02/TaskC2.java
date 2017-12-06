package by.it.mlech.lesson02;

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
    public static void main (String args []){
        Scanner scr = new Scanner(System.in);
        int[] c = new int[3];
        c[0] = scr.nextInt();
        c[1] = scr.nextInt();
        c[2] = c[0]+c[1];

        System.out.println("Ввод:");
        System.out.println(c[0]+" "+c[1]);
        System.out.println();
        System.out.println("Вывод:");
        System.out.println("DEC:"+c[0]+"+"+c[1]+"="+c[2]);
        System.out.println("BIN:"+Integer.toBinaryString(c[0])+"+"+Integer.toBinaryString(c[1])+"="+Integer.toBinaryString(c[2]));
        System.out.println("HEX:"+Integer.toHexString(c[0])+"+"+Integer.toHexString(c[1])+"="+Integer.toHexString(c[2]));
        System.out.println("OKT:"+Integer.toOctalString(c[0])+"+"+Integer.toOctalString(c[1])+"="+Integer.toOctalString(c[2]));

    }

}

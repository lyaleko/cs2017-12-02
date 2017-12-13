package by.it.shmanovskij.lesson02;

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
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int Sum=a+b;
        String ab = Integer.toBinaryString(a);
        String bb = Integer.toBinaryString(b);
        String Sumb = Integer.toBinaryString(Sum);
        String ah = Integer.toHexString(a);
        String bh = Integer.toHexString(b);
        String Sumh = Integer.toHexString(Sum);
        String ao = Integer.toOctalString(a);
        String bo = Integer.toOctalString(b);
        String Sumo = Integer.toOctalString(Sum);
        System.out.println("DEC: "+a+"+"+b+"="+Sum);
        System.out.println("BIN: "+ab+"+"+bb+"="+Sumb);
        System.out.println("HEX: "+ah+"+"+bh+"="+Sumh);
        System.out.println("OKT: "+ao+"+"+bo+"="+Sumo);
    }

}

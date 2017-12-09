package by.it._tasks_.lesson02;

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

        Scanner cs = new Scanner(System.in);
        int x = cs.nextInt();
        int y = cs.nextInt();
        int sum = x + y;
        int val, radix;

        String s = Integer.toString(val = sum,radix = 10);
        System.out.println(s);


//      System.out.println("DEC:" + x + "+" + y + "=" + sum);
//      System.out.println("BIN:" + x + "+" + y + "=" + sum);
//      System.out.println("HEX:" + x + "+" + y + "=" + sum);
//      System.out.println("OKT:" + x + "+" + y + "=" + sum);

        }

    }

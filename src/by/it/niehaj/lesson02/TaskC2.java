package by.it.niehaj.lesson02;

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

        String dec_x = Integer.toString(x,10);
        String dec_y = Integer.toString(y,10);
        String dec_sum = Integer.toString(sum,10);

        String bin_x = Integer.toString(x,2);
        String bin_y = Integer.toString(y,2);
        String bin_sum = Integer.toString(sum,2);

        String hex_x = Integer.toString(x,16);
        String hex_y = Integer.toString(y,16);
        String hex_sum = Integer.toString(sum,16);

        String okt_x = Integer.toString(x,8);
        String okt_y = Integer.toString(y,8);
        String okt_sum = Integer.toString(sum,8);


        System.out.println("DEC:" + dec_x + "+" + dec_y + "=" + dec_sum);
        System.out.println("BIN:" + bin_x + "+" + bin_y + "=" + bin_sum);
        System.out.println("HEX:" + hex_x + "+" + hex_y + "=" + hex_sum);
        System.out.println("OKT:" + okt_x + "+" + okt_y + "=" + okt_sum);
    }
}

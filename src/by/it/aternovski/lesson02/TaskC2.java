package by.it.aternovski.lesson02;

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
    public static void main (String [] args){
        //System.out.println("Введите пжлста два числа от 1 до 99");

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = n1 + n2;

       // System.out.println("Вывод: ");
        //System.out.println("DEC: "+n1+" "+"+"+" "+n2+" "+"="+" "+(n1+n2) );
        System.out.println("BIN:"+(Integer.toString(n1, 2))+"+"+(Integer.toString(n2, 2)) +"="+(Integer.toString(n3,2)));
        System.out.println("DEC:"+n1+ "+" +n2+ "="+ (n1+n2) );
        //System.out.println("BIN: "+(Integer.toString(n1, 2))+" "+"+"+" "+(Integer.toString(n2, 2)) +" "+"="+" "+(Integer.toString(n3,2)));

       // System.out.println("HEX: "+(Integer.toString(n1, 8))+" "+"+"+" "+(Integer.toString(n2, 8)) +" "+"="+" "+(Integer.toString(n3,8)));
        System.out.println("OKT:"+(Integer.toString(n1, 8))+"+"+(Integer.toString(n2, 8)) +"="+(Integer.toString(n3,8)));

        // System.out.println("OKT: "+(Integer.toString(n1, 16))+" "+"+"+" "+(Integer.toString(n2, 16)) +" "+"="+" "+(Integer.toString(n3,16)));
        System.out.println("HEX:"+(Integer.toString(n1, 16))+"+"+(Integer.toString(n2, 16)) +"="+(Integer.toString(n3,16)));
    //+(Integer.toString(n2, 2))))
    }
//System.out.println(Integer.toString(a, 2));

}

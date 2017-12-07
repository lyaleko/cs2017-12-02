package by.it.lyaleko.lesson02;
/*
Измените переменные и строку вывода в программе так,
чтобы она расчитывала и печатала следующее выражение
3*3+4*4=25
 */

class TaskA3 {
    public static void main(String[] args) {
       int a = 3;
        int b = 4;
        int i = a*a;
        int j = b*b;
        int k = i + j;
        System.out.println(a + "*" + a + "+" + b + "*" + b + "=" + k);
    }
}

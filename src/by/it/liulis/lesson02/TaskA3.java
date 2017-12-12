package by.it.liulis.lesson02;
/*
Измените переменные и строку вывода в программе так,
чтобы она расчитывала и печатала следующее выражение
3*3+4*4=25
 */

class TaskA3 {

    public static void main(String[] args) {
        int i = 3;
        int j = 4;
        int k = count(i, j);
        System.out.println(i + "*" + i + "+" + j + "*" + j + "=" + k);
    }

    public static int count(int x, int y) {
        return (x * x) + (y * y);
    }
}

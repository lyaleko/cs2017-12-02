package by.it.mlech.lesson04;

import java.util.Scanner;

/*
На входе вводится число и месяц 2017 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();

        int[] t = new int[13];
        t[0] = 0;
        t[1] = 31;
        t[2] = 28;
        t[3] = 31;
        t[4] = 30;
        t[5] = 31;
        t[6] = 30;
        t[7] = 31;
        t[8] = 31;
        t[9] = 30;
        t[10] = 31;
        t[11] = 30;
        t[12] = 31;

        int sum = d;
        for (int i = 1; i<m; i++){
            sum = sum + t[i];
        }

        System.out.println(sum);

    }

}

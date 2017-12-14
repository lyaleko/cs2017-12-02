package by.it.pashkevich.lesson04;

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
        int day = sc.nextInt();
        int month = sc.nextInt();
        int[] length = new int[13];
        length[0] = 0;
        length[1] = 31;
        length[2] = 28;
        length[3] = 31;
        length[4] = 30;
        length[5] = 31;
        length[6] = 30;
        length[7] = 31;
        length[8] = 31;
        length[9] = 30;
        length[10] = 31;
        length[11] = 30;
        length[12] = 31;
        int date = day;
        for (int n = 1; n<month; n++){
            date = date + length[n];
        }
        System.out.println(date);
    }
}




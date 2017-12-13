package by.it.liulis.lesson04;

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
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int mounth = scanner.nextInt();

        System.out.println(summDays(day, mounth));
    }

    private static int summDays(int day, int mounth){
        int summ = 0;
        for (int i = 1; i < mounth ; i++) {
            summ += countDayInMounth(i);
        }
        summ += day;
        return summ;
    }

    private static int countDayInMounth(int mount){
        if (mount >= 1 && mount <=7){
            if (mount == 2){
                return 28;
            }else if (mount % 2 == 0){
                return 30;
            }else return 31;
        }
        if (mount >= 8 && mount <= 12){
            if (mount % 2 == 0){
                return 31;
            }else return 30;
        }
        return 0;
    }
}

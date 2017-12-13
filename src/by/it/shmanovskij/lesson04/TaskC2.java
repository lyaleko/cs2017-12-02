package by.it.shmanovskij.lesson04;

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
public static void main(String[] args)
{
    int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
    int m,d,sum=0;
    Scanner year= new Scanner(System.in);
    do{System.out.println("Введите месяц 2017 года");
    m=year.nextInt();}while(m<1||m>12);
    do{System.out.println("Введите день "+m+" месяца 2017 года");
    d=year.nextInt();}while(d<1||d>days[m-1]);
    for(int i=0;i<m-1;i++)
        sum+=days[i];
   // sum+=d;
    System.out.println(sum+=d);

}
}

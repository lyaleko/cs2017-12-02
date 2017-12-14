package by.it.pashkevich.lesson04;

/*

День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».


Требования:
1. Программа должна считывать число c клавиатуры.
2. Программа должна выводить текст на экран.
3. Если введено число от 1 до 7, необходимо вывести день недели.
4. Если введено число не входящее в интервал от 1 до 7,
    то вывести уведомление что такого дня недели не существует.
5.  Нельзя использовать массивы или коллекции Java.

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

 */

import java.io.IOException;

public class TaskA2 {
    public static void main(String[] args) throws IOException {
        char ch = (char) System.in.read();
        String s1 = "понедельник";
        String s2 = "вторник";
        String s3 = "среда";
        String s4 = "четверг";
        String s5 = "пятница";
        String s6 = "суббота";
        String s7 = "воскресенье";
        switch (ch) {
            case '1':
                System.out.println(s1);
                break;
            case '2':
                System.out.println(s2);
                break;
            case '3':
                System.out.println(s3);
                break;
            case '4':
                System.out.println(s4);
                break;
            case '5':
                System.out.println(s5);
                break;
            case '6':
                System.out.println(s6);
                break;
            case '7':
                System.out.println(s7);
                break;
                default:
                    System.out.println("такого дня недели не существует");

        }
    }
}

package by.it.liulis.lesson04;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/

import java.util.Scanner;

public class TaskC1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую вы хотите зарплату в $$$?");
        double x = scanner.nextDouble();
        analiz(x);

    }

    public static void analiz(double x){
        if (x < 300 || x > 3000) {
            System.out.println("Мы вам перезвоним!");
        }else {
            for (int i = 0; i <= 14 ; i++) {
                if (i == 0 || i== 13 || i == 14){
                    System.out.printf("За месяц %d начислено $0.0\n", i);
               }else {
                    if (!vivod(i, x)){
                        break;
                    }
                }
            }
        }
    }

    public static boolean vivod(int i, double x){
    double salary = ((50 * x)/100) + x;
            switch (i) {
                case 1:
                    System.out.println("За январь начислено $" + salary);
                    if (salary == 666) {
                        return false;
                    }
                    break;
                case 2:
                    System.out.println("За февраль начислено $" + salary);
                    if (salary == 666) {
                        return false;
                    }
                    break;
                case 3:
                    System.out.println("За март начислено $" + salary);
                    if (salary == 666) {
                        return false;
                    }
                    break;
                case 4:
                    System.out.println("За апрель начислено $" + salary);
                    if (salary == 666) {
                        return false;
                    }
                    break;
                case 5:
                    System.out.println("За май начислено $" + salary);
                    if (salary == 666) {
                        return false;
                    }
                    break;
                case 6:
                    salary = x;
                    System.out.println("За июнь начислено $" + salary);
                    if (salary == 666) {
                        return false;
                    }
                    break;
                case 7:
                    salary = x;
                    System.out.println("За июль начислено $" + salary);
                    if (salary == 666) {
                        return false;
                    }
                    break;
                case 8:
                    salary = x;
                    System.out.println("За август начислено $" + salary);
                    if (salary == 666) {
                        return false;
                    }
                    break;
                case 9:
                    System.out.println("За сентябрь начислено $" + salary);
                    if (salary == 666) {
                        return false;
                    }
                    break;
                case 10:
                    System.out.println("За октябрь начислено $" + salary);
                    if (salary == 666) {
                        return false;
                    }
                    break;
                case 11:
                    System.out.println("За ноябрь начислено $" + salary);
                    if (salary == 666) {
                        return false;
                    }
                    break;
                case 12:
                    System.out.println("За декабрь начислено $" + salary);
                    if (salary == 666) {
                        return false;
                    }
                    break;
            }
            return true;

    }

}

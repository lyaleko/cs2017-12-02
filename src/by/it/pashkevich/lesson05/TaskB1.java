package by.it.pashkevich.lesson05;
/*
Создайте 5 различных строчек в списке
1. Создайте список строк.
2. Добавьте в него 5 различных строчек.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.
*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(0, "Привет");
        list.add(1, "Как дела?");
        list.add(2, "У меня тоже хорошо");
        list.add(3, "Ясно");
        list.add(4, "Пока");
        int n = list.size();
        System.out.println(n);
        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }
}

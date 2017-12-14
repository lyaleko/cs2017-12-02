package by.it.pashkevich.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list20=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        ArrayList<Integer> list3=new ArrayList<Integer>();
        ArrayList<Integer> listOther=new ArrayList<Integer>();
        BufferedReader buffRead=new BufferedReader(new InputStreamReader(System.in));
        int x;
        for(int i=0;i<20;i++){
            String s=buffRead.readLine();
            x=Integer.parseInt(s);
            list20.add(x);
        }
        for(int i=0; i<list20.size();i++){
            x=list20.get(i);
            if(x%3==0) list3.add(x);
            if(x%2==0) list2.add(x);
            else if (x%3!=0) listOther.add(x);
        }
        printList(list3);
        printList(list2);
        printList(listOther);
    }
    public static void printList(List<Integer> list) {
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
}

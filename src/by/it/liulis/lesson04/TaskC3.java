package by.it.liulis.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {

    private final static String[] array = new String[101];

    public static void main(String[] args) {
        initialArray();
        for (int i = 2; i != 11; i++) {
            for (int j = 2; j != 11; j++) {
               showMessage(i, j);
            }
        }
    }

    private static void showMessage(int x, int j) {
        System.out.printf("%s умножить на %s равно %s \n", array[x], array[j],array[(x * j)]);
    }

    private static void initialArray() {
        array[2] = "два";
        array[3] = "три";
        array[4] = "четыре";
        array[5] = "пять";
        array[6] = "шесть";
        array[7] = "семь";
        array[8] = "восемь";
        array[9] = "девять";
        array[10] = "десять";
        array[12] = "двенадцать";
        array[14] = "четырнадцать";
        array[15] = "пятнадцать";
        array[16] = "шестнадцать";
        array[18] = "восемнадцать";
        array[20] = "двадцать";
        array[21] = "двадцать один";
        array[24] = "двадцать четыре";
        array[25] = "двадцать пять";
        array[27] = "двадцать семь";
        array[28] = "двадцать восемь";
        array[30] = "тридцать";
        array[32] = "тридцать два";
        array[35] = "тридцать пять";
        array[36] = "тридцать шесть";
        array[40] = "сорок";
        array[42] = "сорок два";
        array[45] = "сорок пять";
        array[48] = "сорок восемь";
        array[49] = "сорок девять";
        array[50] = "пятьдесят";
        array[54] = "пятьдесят четыре";
        array[56] = "пятьдесят шесть";
        array[60] = "шестьдесят";
        array[63] = "шестьдесят три";
        array[64] = "шестьдесят четыре";
        array[70] = "семьдесят";
        array[72] = "семьдесят два";
        array[80] = "восемьдесят";
        array[81] = "восемьдесят один";
        array[90] = "девяносто";
        array[100] = "сто";
    }
}

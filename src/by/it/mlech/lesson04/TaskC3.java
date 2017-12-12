package by.it.mlech.lesson04;

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
    public static String converter (int cifra){
        String[] malie_chisla = new String[20];
        malie_chisla[0] = "ноль";
        malie_chisla[1] = "один";
        malie_chisla[2] = "два";
        malie_chisla[3] = "три";
        malie_chisla[4] = "четыре";
        malie_chisla[5] = "пять";
        malie_chisla[6] = "шесть";
        malie_chisla[7] = "семь";
        malie_chisla[8] = "восемь";
        malie_chisla[9] = "девять";
        malie_chisla[10] = "десять";
        malie_chisla[11] = "одинадцать";
        malie_chisla[12] = "двенадцать";
        malie_chisla[13] = "тринадцать";
        malie_chisla[14] = "четырнадцать";
        malie_chisla[15] = "пятнадцать";
        malie_chisla[16] = "шестнадцать";
        malie_chisla[17] = "семнадцать";
        malie_chisla[18] = "восемнадцать";
        malie_chisla[19] = "девятнадцать";

        String[] bolshie_chisla = new String[11];
        bolshie_chisla[0] = "";
        bolshie_chisla[1] = "";
        bolshie_chisla[2] = "двадцать";
        bolshie_chisla[3] = "тридцать";
        bolshie_chisla[4] = "сорок";
        bolshie_chisla[5] = "пятьдесят";
        bolshie_chisla[6] = "шестьдесят";
        bolshie_chisla[7] = "семьдесят";
        bolshie_chisla[8] = "восемьдесят";
        bolshie_chisla[9] = "девяносто";
        bolshie_chisla[10] = "сто";

        String rez;

        if (cifra<20) rez = malie_chisla[cifra];
        else if (cifra%10 == 0) rez = bolshie_chisla[cifra/10];
        else rez = bolshie_chisla[cifra/10]+" "+malie_chisla[cifra-cifra/10*10];

        return rez;
    }
    public static void main(String[] args) {

        int i = 10;

        while (i>0){
            int j = 10;

            while (j>0) {
                System.out.println(converter(11-i)+" умножить на "+converter(11-j)+" равно "+ converter((11-i)*(11-j--))+" ");
            }
            i--;
        }
    }
}

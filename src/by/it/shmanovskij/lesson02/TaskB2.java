package by.it.shmanovskij.lesson02;


/*
Подойдет только 20
В методе main расставь правильно знаки плюс и минус, чтобы значение переменной result получилось равным 20.
Знаки нужно расставить только в строчке, в которой объявляется переменная result.
Перед каждой переменной должен стоять знак либо плюс, либо минус.

Требования:

1. Значения переменных: a, b, c, d не изменять.
2. Перед каждой из переменных: a, b, c, d в строке с объявлением переменной result
    должен стоять один знак плюс либо минус.
3. В результате работы программы на экран нужно вывести число 20.
4. Знаки плюс и минус должны быть расставлены правильно.

 */
class TaskB2 {
    private static int a = 1;
    private static int b = 3;
    private static int c = 9;
    private static int d = 27;

    public static void main(String[] args)
    {
       /* int i=4;
        int[] x={1,3,9,27};
        int[][] znak=new int[i][i*i];
        for(int j=0;j<i*i;j++)
            for(int k=0;k<i;k++)
                znak[k][j]=0;
        for(int j=1;j<i*i;j++)
        {
            int sum = 0;
            for (int k = 0; k < i; k++) {
                int razr = 1;
                for (int z = 0; z < k; z++) razr *= 2;
                sum += znak[k][j] * razr;
            }
            sum++;
            for (int k = i - 1; k > 0; k--) {
                int razr = 1;
                for (int z = 0; z < k; z++) razr *= 2;
                znak[k][j + 1] = sum / razr;
                sum = sum % razr;
            }
        }
        for(int j=0;j<i*i;j++)
        {
            int result=0;
            for(int k=0;k<i;k++)
            {
                if(znak[k][j]==0){znak[k][j]=-1; result-=x[k];}
                else if(znak[k][j]==1) result+=x[k];
            }
            if(result==20)
            {
                for (int k = 0; k < i; k++) System.out.print(znak[k][j] * x[k]);
                System.out.println("= " + result);
                break;
            }
        }*/
        System.out.println("-"+a+"+"+b+"-"+c+"+"+d+"="+(d-c+b-a));
    }
}

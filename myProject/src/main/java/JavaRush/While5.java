package JavaRush;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class While5
{
    public static void main(String[] args) throws Exception
    {
        int i = 0;
        int j = 1;

        while (i < 10){
            System.out.println();
            i++;
            j = 0;
            while (j < 10){
                System.out.print(i * (j+1) + " ");
                j++;
            }
        }

    }
}

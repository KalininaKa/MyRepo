package JavaRush;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class While4
{
    public static void main(String[] args) throws Exception
    {
        int i = 0;
        int j = 0;

        while (i < 10){
            System.out.println();
            i++;
            j = 0;
            while (j < 10){
                System.out.print("S");
                j++;
            }
        }
    }
}
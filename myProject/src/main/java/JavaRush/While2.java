package JavaRush;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class While2
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String repString = reader.readLine();
        String sDig = reader.readLine();;

        int iDig = Integer.parseInt(sDig);

        while(iDig > 0) {
            System.out.println(repString);
            iDig--;
        }
    }
}

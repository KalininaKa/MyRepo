package JavaRush;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.io.*;

public class Solution8
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();;

        int iAge = Integer.parseInt(sAge);

        if (iAge > 20) {
            System.out.println("И 18-ти достаточно");
        }

    }
}
package JavaRush;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.*;

public class Solution7
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();;

        int iAge = Integer.parseInt(sAge);

        if (iAge < 18) {
            System.out.println("Подрасти еще");
        }
    }
}

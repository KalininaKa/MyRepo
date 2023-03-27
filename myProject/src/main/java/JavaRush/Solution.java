package JavaRush;

import java.io.*;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sN = reader.readLine();
        int iN = Integer.parseInt(sN);

        System.out.println("Я буду зарабатывать $" + iN + " в час");

    }
}
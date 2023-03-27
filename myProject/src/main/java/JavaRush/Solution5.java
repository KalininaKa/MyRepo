package JavaRush;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution5
{
    public static void main(String[] args) throws Exception
    {

        int minOne = 0, minTwo = 0, minThree = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sDigOne = reader.readLine();
        String sDigTwo = reader.readLine();
        String sDigThree = reader.readLine();

        int iDigOne = Integer.parseInt(sDigOne);
        int iDigTwo = Integer.parseInt(sDigTwo);
        int iDigThree = Integer.parseInt(sDigThree);

        if (iDigOne < iDigTwo) {
            if (iDigOne < iDigThree)
            {
                minOne = iDigOne;
                if (iDigTwo < iDigThree){
                    minTwo = iDigTwo;
                    minThree = iDigThree;
                } else {
                    minTwo = iDigThree;
                    minThree = iDigTwo;
                }

            } else {
                minOne = iDigThree;
                minTwo = iDigOne;
                minThree = iDigTwo;
            }
        } else
        {
            if (iDigTwo < iDigThree)
            {
                minOne = iDigTwo;
                if (iDigOne < iDigThree)
                {
                    minTwo = iDigOne;
                    minThree = iDigThree;
                } else
                {
                    minTwo = iDigThree;
                    minThree = iDigOne;
                }

            } else {
                minOne = iDigThree;
                minTwo = iDigTwo;
                minThree = iDigOne;
            }
        }

        System.out.println(minThree);
        System.out.println(minTwo);
        System.out.println(minOne);

    }
}
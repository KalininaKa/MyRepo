package JavaRush;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution6
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String nameOne = reader.readLine();
        String nameTwo = reader.readLine();

        if (nameOne.equals(nameTwo)) {
            System.out.println("Имена одинаковые");
        } else if (nameOne.length() == nameTwo.length()) {
            System.out.println("Длины имен равны");
        }
    }
}

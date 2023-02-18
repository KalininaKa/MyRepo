//преобразование массива в ArrayList

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String[] my_array = new String[]{"красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(my_array));

        System.out.println(list);
    }
}

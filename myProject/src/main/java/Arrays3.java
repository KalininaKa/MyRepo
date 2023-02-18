//ArrayList в массив

import java.util.ArrayList;

public class Arrays3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("красный");
        list.add("оранжевый");
        list.add("желтый");
        list.add("зеленый");
        list.add("голубой");
        list.add("синий");
        list.add("фиолетовый");

        String[] my_array = new String[list.size()];

        list.toArray(my_array);

        for (String string : my_array) {
            System.out.println(string);
        }
    }
}

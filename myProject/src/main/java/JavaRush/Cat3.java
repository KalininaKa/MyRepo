package JavaRush;

/* Реализовать метод setCatsCount
Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать значение переменной catsCount равное переданному параметру.
*/

public class Cat3 {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Cat3.catsCount = catsCount;
    }
}

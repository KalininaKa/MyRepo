package JavaRush;

/* Реализовать метод addNewCat
Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.
*/

public class Cat2 {
    private static int catsCount = 0;

    public static void addNewCat() {
        catsCount ++;
    }
}

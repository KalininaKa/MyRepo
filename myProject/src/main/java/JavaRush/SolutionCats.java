package JavaRush;

/* Подсчитать количество котов
Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильно их количество.
*/

public class SolutionCats
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();

        Cat cat2 = new Cat();

        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count = 0;

        Cat() {
            count++;
        }
    }
}
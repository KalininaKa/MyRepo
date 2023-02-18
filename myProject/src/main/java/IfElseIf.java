import java.util.Scanner;

//через оператор if-else-if
public class IfElseIf {
    public static void main(String args[]) {
        int num;
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if (num == 1) {
            System.out.println("Понедельник");
        } else if (num == 2) {
            System.out.println("Вторник");
        } else if (num == 3) {
            System.out.println("Среда");
        } else if (num == 4) {
            System.out.println("четверг");
        } else if (num == 5) {
            System.out.println("Пятница");
        } else if (num == 6) {
            System.out.println("Суббота");
        } else if (num == 7) {
            System.out.println("Воскресение");
        }
        else {
            System.out.println("Ошибка");
        }
    }
}
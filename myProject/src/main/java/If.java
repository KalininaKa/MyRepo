import java.util.Scanner;

//через оператор if
public class If {
    public static void main(String args[]) {
        int num;
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("Число " + num + " - четное");
        if (num % 2 != 0)
            System.out.println("Число " + num + " - нечетное");
    }
}
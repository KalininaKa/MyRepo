import java.util.Scanner;

//через оператор if-else
public class IfElse {
    public static void main(String args[]) {
        int num;
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("Число " + num + " - четное");
       else
            System.out.println("Число " + num + " - нечетное");
    }
}
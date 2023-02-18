import java.util.Scanner;

public class Example1 {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите значение в дюймах: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
import java.util.Scanner;

public class ElectronicWatch2 {
    public static void main(String[] args) {
        System.out.print("Введите seconds: ");
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();

        int hours = seconds / 3600 % 24;
        int minutes = (seconds % 3600) / 60;
        int seconds1 = seconds % 60;
        String hours1 = (hours < 24)? "" + hours: (hours==24)? "0" :Integer.toString(hours) ;
        System.out.printf("Время на часах: " + hours1 + ":" + "%02d:%02d", minutes, seconds1);
    }
}
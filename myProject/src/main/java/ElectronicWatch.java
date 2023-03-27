import java.util.Scanner;

import static java.util.concurrent.TimeUnit.*;

public class ElectronicWatch {
    public static void main(String[] args) {
        System.out.print("Введите seconds: ");
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();

        //1.
        int hours = seconds / 3600 % 24;
        int minutes = seconds % 3600 / 60;
        int seconds1 = seconds % 60;
        System.out.println("Время на часах: " + String.format("%d:%02d:%02d", hours, minutes, seconds1));

        //2.
        long day = SECONDS.toDays(seconds);
        long hour = SECONDS.toHours(seconds) - DAYS.toHours(day);
        long minute = SECONDS.toMinutes(seconds) - DAYS.toMinutes(day) - HOURS.toMinutes(hour);
        long second = SECONDS.toSeconds(seconds) - DAYS.toSeconds(day) - HOURS.toSeconds(hour) - MINUTES.toSeconds(minute);
        System.out.println("Время на часах: " + hour + ":" + minute + ":" + second);
    }
}


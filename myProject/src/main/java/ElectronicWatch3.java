import java.util.Scanner;

public class ElectronicWatch3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int seconds1 = seconds % 60;

        if (hours < 24){
            int hours1 = Integer.parseInt("" + hours);
            System.out.printf ( hours1 + ":" + "%02d:%02d", minutes, seconds1);}
        else if (hours == 24){
            int hours1 = 0;
            System.out.printf ( hours1 + ":" + "%02d:%02d", minutes, seconds1);}
        else {
            int hours1 = hours % 24;
            System.out.printf ( hours1 + ":" + "%02d:%02d", minutes, seconds1);;
        }


    }}
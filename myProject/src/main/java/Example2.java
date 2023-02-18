import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float timeSeconds;
        float mps,kph, mph;
        System.out.print("Введите дистанцию в метрах: ");
        float distance = scanner.nextFloat();
        System.out.print("Часов: ");
        float hr = scanner.nextFloat();
        System.out.print("Минут: ");
        float min = scanner.nextFloat();
        System.out.print("Секунд: ");
        float sec = scanner.nextFloat();
        timeSeconds = (hr*3600) + (min*60) + sec;
        mps = distance / timeSeconds;
        kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
        mph = kph / 1.609f;
        System.out.println("твоя скорость в м/с "+mps);
        System.out.println("твоя скорость в км/ч "+kph);
        System.out.println("твоя скорость в милях/ч is "+mph);

        scanner.close();
    }
}
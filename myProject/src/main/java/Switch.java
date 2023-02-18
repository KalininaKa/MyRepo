import java.util.Scanner;

//через switch
public class Switch {
    public static void main(String args[]) {
        int num;
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        switch (num) {
            case 1:
            System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресение");
                break;
            default:
            System.out.println("Ошибка");
        }
    }
}
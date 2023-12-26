import java.util.Scanner;

public class Vremjagoda2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца:");
        int numMonth = scanner.nextInt();
        String res;
        if (numMonth == 12 || numMonth == 1 || numMonth == 2) {
            System.out.println("Зима");
        } else if (numMonth == 3 || numMonth == 4 || numMonth == 5) {
            System.out.println("Весна");
        } else if (numMonth == 6 || numMonth == 7 || numMonth == 8) {
            System.out.println("Лето");
        } else if (numMonth == 9 || numMonth == 10 || numMonth == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Нет такого месяца");
        }

    }
}

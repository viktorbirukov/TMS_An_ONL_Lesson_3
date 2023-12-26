import java.util.Scanner;

public class Raduga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер и узнайте цвет радуги:");
        int n = scanner.nextInt();
        String res;
        switch (n) {
            case 1:
                res = ("Красный\n");
                break;
            case 2:
                res = ("Оранжевый\n");
                break;
            case 3:
                res = ("Желтый\n");
                break;
            case 4:
                res = ("Зеленый\n");
                break;
            case 5:
                res = ("Голубой\n");
                break;
            case 6:
                res = ("Синий\n");
                break;
            case 7:
                res = ("Фиолетовый\n");
                break;
            default:
                res = ("Нет такого цвета в радуге\n");
                break;

        }
        System.out.println(res);
    }
}
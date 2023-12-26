import java.util.Scanner;

public class Summa_chisel {

    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i=1; i<= a; i++){
            sum = sum + i;
        }
        System.out.println (sum);
    }
}

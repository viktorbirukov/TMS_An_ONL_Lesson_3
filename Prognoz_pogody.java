import java.util.Scanner;

class Prognoz_pogody{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        double a = 20; double s = sc.nextDouble();

        if (s<a) System.out.print("Холодно(");
        if (s==a) System.out.print("Прохладно...");
        if(s>a) System.out.print("Тепло!");
    }
}
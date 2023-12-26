public class Kvadraty_chisel_10_20 {
    public static void main(String[] arg) {
        //Вариант 1
        int a = 10;
        int b = 21;
        while (a < b) {//
            int result = a * a;
            System.out.println(result);
            a = a + 1;// Вариант 2, Не проверял, но можно a++;

        }
    }
}
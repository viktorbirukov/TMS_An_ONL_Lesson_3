
public class Chislo_v_stepen {
    public static void main(String[] args) {
        int number = 7; // Возводимое в степень число
        int result = 0; // Результат возведения в степень
        int power = 1; // Начальный показатель степени
        while (power <= 14) { // условие входа в цикл
            result = result + number;
            System.out.println(number + " в степени " + power + " = " + result);
            power++;
        }

    }
}

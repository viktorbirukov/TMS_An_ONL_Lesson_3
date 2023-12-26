import java.io.*;

public class Raduga2
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        if (i == 1)
            System.out.println("Каждый");
        else if (i == 2)
            System.out.println("Охотник");
        else if (i == 3)
            System.out.println("Желает");
        else if (i == 4)
            System.out.println("Знать");
        else if (i == 5)
            System.out.println("Где");
        else if (i == 6)
            System.out.println("Сидит");
        else if (i == 7)
            System.out.println("Фазан");
        else
            System.out.println("Фазан улетел!!!");

    }

}
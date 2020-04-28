//Zlatopolsky 5.27;

import java.util.Scanner;
import java.math.*;

public class z527 {
    public static void main(String[] args) {
        int a, b;
        long result = 0;
        Scanner number = new Scanner(System.in);
        //вариант а
        for (int i = 100; i < 501; i++)
            result += i;
        System.out.println("Ответ вариант а):" + result);
        //вариант б)
        System.out.println("Введите число а, меньше или равно 500:");
        a = number.nextInt();
       /* System.out.println("Введите число b, больше или равно -10:");
        b = number.nextInt();*/
        // number.close();

        result = 0; //сбросим результат предыдущего вычисления
        for (int i = a; i < 501; i++)//вычисление варианта б)
            result += i;
        System.out.println("Ответ вариант б):" + result);

        //вариант в)
        /*System.out.println("Введите число а, меньше или равно 500:");
        a = number.nextInt();*/
        System.out.println("Введите число b, больше или равно -10:");
        b = number.nextInt();
        //number.close();
        result = 0; //сбросим результат предыдущего вычисления
        for (int i = -10; i < (b + 1); i++)
            result += i;
        System.out.println("Ответ вариант в):" + result);
        //вариант г)
        result = 0; //сбросим результат предыдущего вычисления
        System.out.println("Введите число а:");
        a = number.nextInt();
        System.out.println("Введите число b, больше или равно а:");
        b = number.nextInt();
        number.close();
        for (int i = a; i < (b + 1); i++)
            result += i;
        System.out.println("Ответ вариант г):" + result);
    }
}

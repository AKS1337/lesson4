//Zlatopolsky 5.10

import java.util.Scanner;

public class z510 {
    public static void main(String[] args) {
        Scanner exch = new Scanner(System.in);
        System.out.println("Введите курс рубля к доллару: ");
        double currency = exch.nextDouble();
        exch.close();
        int nominals[];
        nominals = new int[5];
        nominals[0] = 1;
        nominals[1] = 2;
        nominals[2] = 5;
        nominals[3] = 10;
        nominals[4] = 20;
        for (int i = 0; i < 5; i++) {
            double rubles = nominals[i] * currency;
            System.out.println(rubles + " рублей за " + nominals[i] + " доллар(ов)");
        }

    }
}

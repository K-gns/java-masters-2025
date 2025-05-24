package timus;

import java.util.Scanner;
import java.util.Locale;

public class timus_1582 {
    public static void main(String[] args) {
        //Чтобы принимало точки в качестве разделителя дробного числа
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double k1 = sc.nextDouble();
        double k2 = sc.nextDouble();
        double k3 = sc.nextDouble();
        sc.close();

        // Общая сумма ставок
        double S = 1000.0;

        // Вычисляем выйгрыш
        double invSum = 1.0/k1 + 1.0/k2 + 1.0/k3;
        double V = S / invSum;

        // Округляем
        long answer = Math.round(V);

        System.out.println(answer);
    }
}

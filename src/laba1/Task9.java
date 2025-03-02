package laba1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        double a = in.nextDouble();

        double first = a - 1;
        double second = a;
        double third = a + 1;
        double sum = first + second + third; // сумма равна 3a
        double fourth = sum * sum;            // квадрат суммы

        System.out.printf("Последовательность чисел: %.2f, %.2f, %.2f, %.2f%n", first, second, third, fourth);
        in.close();
    }
}

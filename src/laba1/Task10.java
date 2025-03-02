package laba1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = in.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = in.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;

        System.out.printf("Сумма: %.2f, Разность: %.2f%n", sum, diff);
        in.close();
    }
}

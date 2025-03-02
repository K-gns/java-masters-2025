package laba1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название дня недели: ");
        String dayOfWeek = in.nextLine();

        System.out.print("Введите название месяца: ");
        String month = in.nextLine();

        System.out.print("Введите число (номер дня в месяце): ");
        int day = in.nextInt();

        System.out.printf("Сегодня %s, %d %s%n", dayOfWeek, day, month);
        in.close();
    }
}

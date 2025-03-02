package laba1;

import java.time.Year;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();

        int currentYear = Year.now().getValue();
        int birthYear = currentYear - age;

        System.out.printf("Ваш год рождения: %d%n", birthYear);
        in.close();
    }
}

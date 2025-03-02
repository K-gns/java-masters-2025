package laba1;

import java.util.Scanner;
import java.time.Year;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите год вашего рождения: ");
        int birthYear = in.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.printf("Ваш возраст: %d%n", age);
        in.close();
    }
}

package laba1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = in.nextLine();

        System.out.print("Введите возраст: ");
        int age = in.nextInt();

        System.out.printf("Имя: %s, Возраст: %d%n", name, age);
        in.close();
    }
}

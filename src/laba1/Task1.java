package laba1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input last name: ");
        String lastName = in.nextLine();

        System.out.println("Input first name: ");
        String firstName = in.nextLine();

        System.out.println("Input second name: ");
        String secondName = in.nextLine();

        String fio = "FIO: %s %s %s ";
        String result = String.format(fio, lastName, firstName, secondName);
        System.out.println(result);
        in.close();
    }
}

package timus;

import java.util.Scanner;

public class timus_1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] codes = new String[n];
        for (int i = 0; i < n; i++) {
            codes[i] = scanner.nextLine();
        }
        String input = scanner.nextLine();
        char prefix = input.charAt(0);

        for (String code : codes) {
            if (code.charAt(0) == prefix) {
                System.out.println(code);
            }
        }
    }
}

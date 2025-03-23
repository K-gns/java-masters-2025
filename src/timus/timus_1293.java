package timus;

import java.util.Scanner;

public class timus_1293 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int result = N * 2 * A * B;
        System.out.println(result);
    }
}

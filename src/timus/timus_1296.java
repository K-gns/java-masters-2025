package timus;

import java.util.Scanner;

public class timus_1296 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < N; i++) {
            int p = sc.nextInt();
            currentSum = Math.max(0, currentSum + p);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
    }
}
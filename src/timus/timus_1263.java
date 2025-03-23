package timus;

import java.util.Scanner;

public class timus_1263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] votes = new int[N + 1];

        for (int i = 0; i < M; i++) {
            int candidate = sc.nextInt();
            votes[candidate]++;
        }

        for (int i = 1; i <= N; i++) {
            double percentage = (votes[i] * 100.0) / M;
            System.out.printf("%.2f%%%n", percentage);
        }
    }
}

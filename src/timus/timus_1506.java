package timus;

import java.util.Scanner;

public class timus_1506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        // минимальное число строк
        int R = (N + K - 1) / K;

        // Выводим построчно
        for (int r = 0; r < R; r++) {
            StringBuilder line = new StringBuilder();
            for (int c = 0; c < K; c++) {
                int idx = c * R + r;
                if (idx < N) {
                    line.append(String.format("%4d", a[idx]));
                    if (c < K - 1 && (c + 1) * R + r < N) {
                        line.append(' ');
                    }
                }
            }

            // удалить возможные "концевые" пробелы
            System.out.println(line.toString().replaceAll("\\s+$", ""));
        }
    }
}

package timus;

import java.util.*;

public class timus_1796 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] d = {10, 50, 100, 500, 1000, 5000};
        int[] c = new int[6];
        for (int i = 0; i < 6; i++) {
            c[i] = in.nextInt();
        }
        int p = in.nextInt();

        // Считаем общую сумму S
        int S = 0;
        for (int i = 0; i < 6; i++) {
            S += d[i] * c[i];
        }

        List<Integer> ans = new ArrayList<>();
        for (int t = 1, tmax = S / p; t <= tmax; t++) {
            if (S < t * p) break;
            boolean ok = true;
            // проверяем условие «без лишних купюр»
            for (int i = 0; i < 6; i++) {
                if (c[i] > 0 && S - d[i] >= t * p) {
                    ok = false;
                    break;
                }
            }
            if (ok) ans.add(t);
        }

        // Вывод
        System.out.println(ans.size());
        for (int t : ans) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}

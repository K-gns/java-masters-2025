package timus;

import java.util.Scanner;

public class timus_1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < queries; i++) {
            long k = sc.nextLong();
            long m = (long)Math.ceil((Math.sqrt(8 * k + 1) - 3) / 2);
            long sumPrev = m * (m + 1) / 2;
            long posInNumber = k - sumPrev;
            char digit = posInNumber == 1 ? '1' : '0';
            sb.append(digit);
            if (i < queries - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}

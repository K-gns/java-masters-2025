package timus;

/*
Условие задачи:
Стоит себе ферма. На ферме сидит фермер и считает, сколько кого есть у него на ферме - a верблюдов, b баранов, c зеленых тараканов.
Почему-то a^n + b^n = c^n.
Известно n.
Найти все остальное.

Исходные данные:
n (0 ≤ n ≤ 100)

Результат:
Три различных целых числа (a, b, c) таких, что a^n + b^n = c^n, 1 ≤ a, b, c ≤ 100.
Если решений несколько, вывести то, где a минимально. Если и таких несколько, вывести то, где минимально b и т.д.
Вывести -1, если решения нет.

Примеры:
исходные данные: 0
результат: -1

исходные данные: 1
результат: 1 2 3
*/

import java.math.BigInteger;
import java.util.Scanner;

public class timus_1349 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println(-1);
            return;
        }
        BigInteger[] power = new BigInteger[101];
        for (int i = 1; i <= 100; i++){
            power[i] = BigInteger.valueOf(i).pow(n);
        }
        for (int a = 1; a <= 100; a++){
            for (int b = 1; b <= 100; b++){
                if(a == b) continue;
                for (int c = 1; c <= 100; c++){
                    if(c == a || c == b) continue;
                    if(power[a].add(power[b]).equals(power[c])){
                        System.out.println(a + " " + b + " " + c);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}

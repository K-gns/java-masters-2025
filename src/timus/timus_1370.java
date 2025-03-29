package timus;

/*
Условие задачи:
Первая строка содержит два целых числа через пробел, N и M.
N (11 ≤ N ≤ 1000) — количество цифр, написанных на колесе,
а M (1 ≤ M ≤ 32767) — количество щелчков колеса.
Следующие N строк содержат все цифры, написанные на колесе, по одной цифре в строке.
Цифры даны в порядке по часовой стрелке.
Первые 10 цифр видны в окошке до поворота колеса.
Колесо крутится только против часовой стрелки, то есть после одного щелчка в окошке покажутся цифры со 2 по 11-ю.

Результат:
Выведите число, которое появилось в окошке машины после вращения колеса.
Число должно состоять ровно из 10 цифр и может иметь ведущие нули.

Пример:
исходные данные
12 7
1
2
3
4
5
6
7
8
9
0
7
7
результат
8907712345
*/

import java.util.Scanner;

public class timus_1370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] digits = new String[N];
        for (int i = 0; i < N; i++) {
            digits[i] = sc.next();
        }
        int start = M % N;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            result.append(digits[(start + i) % N]);
        }
        System.out.println(result);
    }
}

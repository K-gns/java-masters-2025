package laba3;

public class n3_task2 {
    public static void main(String[] args) {
        int n = 42;
        System.out.print(n + " в двоичной системе: ");
        toBinaryRec(n);
        System.out.println();
    }

    private static void toBinaryRec(int n) {
        if (n > 1) {
            toBinaryRec(n / 2);
        }
        System.out.print(n % 2);
    }
}

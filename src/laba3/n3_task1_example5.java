package laba3;

public class n3_task1_example5 {
    public static void main(String[] args) {
        int index = 6; // n-е число Фибоначчи
        long fib = fibonacci(index);
        System.out.println("F(" + index + ") = " + fib);
    }

    private static long fibonacci(int n) {
        // демонстративный вывод, чтобы видеть «ветвление»:
        // System.out.println("Вызов fibonacci(" + n + ")");
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

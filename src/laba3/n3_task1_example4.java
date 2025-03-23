package laba3;

public class n3_task1_example4 {
    public static void main(String[] args) {
        int n = 5;
        long fact = factorial(n);
        System.out.println(n + "! = " + fact);
    }

    private static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

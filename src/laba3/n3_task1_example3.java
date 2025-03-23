package laba3;

public class n3_task1_example3 {
    public static void main(String[] args) {
        recExample3(1);
    }

    private static void recExample3(int x) {
        if (x >= 0 && x < 20) {
            System.out.println("Вход в метод, x = " + x);
            recExample3(2 * x + 1);
            System.out.println("Возврат из метода, x = " + x);
        }
    }
}

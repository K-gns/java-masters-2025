package laba3;

public class n3_task1_example2 {
    public static void main(String[] args) {
        recExample2(1);
    }

    private static void recExample2(int x) {
        if (x >= 0 && x < 20) {
            recExample2(2 * x + 1);
            System.out.print(x + " ");
        }
    }
}

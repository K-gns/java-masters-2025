package laba3;

public class n3_task1_example1 {
    public static void main(String[] args) {
        recExample1(2);
    }

    private static void recExample1(int x) {
        if (x >= 0 && x < 20) {
            System.out.print(x + " ");
            recExample1(2 * x + 1);
        }
    }
}

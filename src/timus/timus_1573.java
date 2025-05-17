package timus;

import java.util.*;

public class timus_1573 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int B = in.nextInt(); // Blue
        int R = in.nextInt(); // Red
        int Y = in.nextInt(); // Yellow
        int K = in.nextInt();
        long ways = 1;
        for (int i = 0; i < K; i++) {
            String color = in.next();
            switch (color) {
                case "Blue":
                    ways *= B;
                    break;
                case "Red":
                    ways *= R;
                    break;
                case "Yellow":
                    ways *= Y;
                    break;
            }
        }
        System.out.println(ways);
    }
}

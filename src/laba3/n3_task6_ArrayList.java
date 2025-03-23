package laba3;

import java.util.ArrayList;
import java.util.List;

public class n3_task6_ArrayList {
    public static void main(String[] args) {
        int N = 100000;

        // Создаём список
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        int index = 0;
        while (list.size() > 1) {
            index = (index + 1) % list.size();
            list.remove(index);
        }

        long end = System.currentTimeMillis();

        System.out.println("Остался: " + list.get(0));
        System.out.println("ArrayList, N=" + N + " => время = " + (end - start) + " мс");
    }
}

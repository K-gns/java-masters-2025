package laba3;

import java.util.LinkedList;
import java.util.List;

public class n3_task6_LinkedList {
    public static void main(String[] args) {
        int N = 100000;

        List<Integer> list = new LinkedList<>();
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
        System.out.println("LinkedList, N=" + N + " => время = " + (end - start) + " мс");
    }
}

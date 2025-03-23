package laba3;

import java.util.*;

public class n6_CollectionCompare {
    private static final int N = 100000; // измените на большее, если всё ещё слишком мало

    public static void main(String[] args) {
        benchmark("ArrayList", new ArrayList<>());
        benchmark("SortedSet", new TreeSet<>());
        benchmark("TreeSet", new TreeSet<>());
    }

    private static void benchmark(String name, Collection<Integer> col) {
        System.out.println("=== " + name + " ===");

        // Наполняем коллекцию
        for (int i = 0; i < N; i++) col.add(i);

        // Выполняем и измеряем каждую операцию N раз
        System.out.printf("Add first: %d ms%n", timeMs(() -> {
            for (int i = 0; i < N; i++) {
                if (col instanceof List) ((List<Integer>) col).add(0, -1);
                else col.add(-1);
            }
        }));

        System.out.printf("Add middle: %d ms%n", timeMs(() -> {
            for (int i = 0; i < N; i++) {
                if (col instanceof List) ((List<Integer>) col).add(col.size()/2, -2);
                else col.add(col.size()/2);
            }
        }));

        System.out.printf("Add last: %d ms%n", timeMs(() -> {
            for (int i = 0; i < N; i++) col.add(i);
        }));

        System.out.printf("Remove first: %d ms%n", timeMs(() -> {
            for (int i = 0; i < N && !col.isEmpty(); i++) {
                if (col instanceof List) ((List<Integer>) col).remove(0);
                else ((SortedSet<Integer>) col).remove(((SortedSet<Integer>) col).first());
            }
        }));

        System.out.printf("Remove middle: %d ms%n", timeMs(() -> {
            if (col instanceof List) {
                ((List<Integer>) col).remove(((List<Integer>) col).size() / 2);
            } else {
                SortedSet<Integer> set = (SortedSet<Integer>) col;
                int steps = set.size() / 2;
                if (steps > 0) {
                    Iterator<Integer> it = set.iterator();
                    for (int i = 0; i < steps; i++) it.next();
                    it.remove();
                }
            }
        }));

        System.out.printf("Remove last: %d ms%n", timeMs(() -> {
            for (int i = 0; i < N && !col.isEmpty(); i++) {
                if (col instanceof List) ((List<Integer>) col).remove(((List<Integer>) col).size()-1);
                else ((SortedSet<Integer>) col).remove(((SortedSet<Integer>) col).last());
            }
        }));

        if (col instanceof List) {
            System.out.printf("Get by index: %d ms%n", timeMs(() -> {
                List<Integer> list = (List<Integer>) col;
                for (int i = 0; i < N; i++) list.get(i % list.size());
            }));
        } else {
            System.out.println("Get by index: N/A");
        }

        System.out.println();
    }

    private static long timeMs(Runnable action) {
        long start = System.nanoTime();
        action.run();
        return (System.nanoTime() - start) / 1_000_000;
    }
}

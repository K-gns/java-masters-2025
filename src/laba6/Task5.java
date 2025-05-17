package laba6;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        int size = 1_000_000;
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = (int) (Math.random() * 1000);
        }

        int max = findMax(data);
        System.out.println("Максимальное значение: " + max);
    }

    public static int findMax(int[] array) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();

        System.out.println("cores:" + cores);

        int length = array.length;
        int chunkSize = (length + cores - 1) / cores;  // округление вверх

        // Массив для хранения результатов от каждого потока
        int[] localMax = new int[cores];
        Thread[] threads = new Thread[cores];

        for (int i = 0; i < cores; i++) {
            final int threadIndex = i;
            final int start = i * chunkSize;
            final int end = Math.min(start + chunkSize, length);

            threads[i] = new Thread(() -> {
                int maxValue = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (array[j] > maxValue) {
                        maxValue = array[j];
                    }
                }
                localMax[threadIndex] = maxValue;
            }, "MaxFinder-" + i);

            threads[i].start();
        }

        // Дождаться завершения всех потоков
        for (Thread t : threads) {
            t.join();
        }

        // Найти максимальное среди частичных результатов
        int globalMax = Integer.MIN_VALUE;
        for (int m : localMax) {
            if (m > globalMax) {
                globalMax = m;
            }
        }
        return globalMax;
    }
}

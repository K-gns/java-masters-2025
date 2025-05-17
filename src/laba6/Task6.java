package laba6;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        int size = 1_000_000;
        int[] data = new int[size];
        // Заполним случайными числами от 0 до 9
        for (int i = 0; i < size; i++) {
            data[i] = (int) (Math.random() * 10);
        }

        long sum = parallelSum(data);
        System.out.println("Сумма всех элементов: " + sum);
    }

    public static long parallelSum(int[] array) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        int length = array.length;
        int chunkSize = (length + cores - 1) / cores;  // округление вверх

        // Массив для хранения частичных сумм
        long[] partialSums = new long[cores];
        Thread[] threads = new Thread[cores];

        for (int i = 0; i < cores; i++) {
            final int threadIndex = i;
            final int start = i * chunkSize;
            final int end = Math.min(start + chunkSize, length);

            threads[i] = new Thread(() -> {
                long sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                partialSums[threadIndex] = sum;
            }, "SumWorker-" + i);

            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        // Собираем финальную сумму
        long total = 0;
        for (long part : partialSums) {
            total += part;
        }
        return total;
    }
}

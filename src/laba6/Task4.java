package laba6;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            final int threadNumber = i + 1;
            threads[i] = new Thread(() -> {
                System.out.println("Поток #" + threadNumber);
            }, "Thread-" + threadNumber);
            threads[i].start();
        }

        // Ждём, пока все потоки завершатся
        for (Thread t : threads) {
            t.join();
        }
    }
}

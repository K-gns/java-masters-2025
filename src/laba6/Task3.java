package laba6;

public class Task3 {
    private static final Object lock = new Object();
    private static int number = 1;
    private static final int MAX = 10;

    public static void main(String[] args) throws InterruptedException {
        Thread evenThread = createPrinterThread(0, "Even-Thread");
        Thread oddThread  = createPrinterThread(1, "Odd-Thread");

        evenThread.start();
        oddThread.start();

        evenThread.join();
        oddThread.join();
    }

    /**
     * Возвращает поток, печатающий все числа от 1 до MAX,
     * у которых number % 2 == остатоск (parity) .
     */
    private static Thread createPrinterThread(int parity, String name) {
        return new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (number > MAX) {
                        lock.notify(); // разбужу партнёра, если он ждёт
                        break;
                    }
                    if (number % 2 == parity) {
                        System.out.println(name + ": " + number);
                        number++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }, name);
    }
}

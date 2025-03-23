package laba3;
import java.util.Scanner;

public class n3_task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Введите элементы массива:");
        readArrayRec(arr, 0, in);

        System.out.println("Вывод массива (рекурсия):");
        printArrayRec(arr, 0);
    }

    // Рекурсивный ввод
    private static void readArrayRec(int[] arr, int index, Scanner in) {
        if (index < arr.length) {
            arr[index] = in.nextInt();
            readArrayRec(arr, index + 1, in);
        }
    }

    // Рекурсивный вывод
    private static void printArrayRec(int[] arr, int index) {
        if (index < arr.length) {
            System.out.print(arr[index] + " ");
            printArrayRec(arr, index + 1);
        }
    }
}

package laba2;

import java.util.Random;
import java.util.Scanner;

public class n2_task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();

        // Инициализируем массив
        int[] array = new int[size];
        Random random = new Random();

        // Заполняем массив
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        // Выводим массив в консоль
        System.out.println("Сгенерированный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Определяем минимальное значение в массиве
        if (size > 0) {
            int min = array[0];
            for (int i = 1; i < size; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }

            System.out.println("Минимальное значение: " + min);

            System.out.print("Индексы элементов с минимальным значением: ");
            for (int i = 0; i < size; i++) {
                if (array[i] == min) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Массив пустой!");
        }
    }
}

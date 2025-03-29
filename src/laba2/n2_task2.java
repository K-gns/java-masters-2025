package laba2;

import java.util.Scanner;

public class n2_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int num = 1;

        // Заполняем матрицу
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Чётная строка:
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = num++;
                }
            } else {
                // Нечётная строка:
                for (int j = cols - 1; j >= 0; j--) {
                    matrix[i][j] = num++;
                }
            }
        }

        // Выводим матрицу
        System.out.println("Матрица, заполненная \"змейкой\":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}

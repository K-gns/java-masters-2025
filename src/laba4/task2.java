package laba4;

import java.util.Scanner;

// Задание 2.1: среднее значение среди положительных элементов массива
class Task2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int n = Integer.parseInt(sc.nextLine());
            int[] arr = new int[n];
            System.out.println("Введите " + n + " целых чисел:");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(sc.nextLine());
            }
            int sum = 0, count = 0;
            for (int v : arr) {
                if (v > 0) {
                    sum += v;
                    count++;
                }
            }
            if (count == 0) {
                throw new IllegalStateException("Положительные элементы отсутствуют");
            }
            double avg = (double) sum / count;
            System.out.printf("Среднее значение положительных элементов: %.2f%n", avg);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено нецелое число");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: размер массива отрицателен");
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

// Задание 2.2: вывод столбца матрицы по индексу
class Task2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите число строк матрицы: ");
            int rows = Integer.parseInt(sc.nextLine());
            System.out.print("Введите число столбцов матрицы: ");
            int cols = Integer.parseInt(sc.nextLine());
            int[][] mat = new int[rows][cols];
            System.out.println("Введите матрицу по строкам:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    mat[i][j] = Integer.parseInt(sc.nextLine());
                }
            }
            System.out.print("Введите номер столбца (0–" + (cols-1) + "): ");
            int c = Integer.parseInt(sc.nextLine());
            System.out.println("Столбец №" + c + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(mat[i][c]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено нецелое число");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: столбец с таким номером не существует");
        } finally {
            sc.close();
        }
    }
}

// Задание 2.3: сумма элементов byte-массива
class Task2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int n = Integer.parseInt(sc.nextLine());
            byte[] arr = new byte[n];
            System.out.println("Введите " + n + " чисел в диапазоне от -128 до 127:");
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(sc.nextLine());
                if (val < Byte.MIN_VALUE || val > Byte.MAX_VALUE) {
                    throw new IllegalArgumentException("Число вне диапазона byte: " + val);
                }
                arr[i] = (byte) val;
            }
            int sum = 0;
            for (byte b : arr) {
                sum = Math.addExact(sum, b);
            }
            System.out.println("Сумма элементов: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено нечисловое значение");
        } catch (NegativeArraySizeException e) {
            System.out.println("Ошибка: размер массива отрицателен");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: переполнение при вычислении суммы");
        } finally {
            sc.close();
        }
    }
}

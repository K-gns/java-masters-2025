package laba7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Запрос имени файла и слова для поиска
        System.out.print("Введите путь к файлу: ");
        String filePath = sc.nextLine().trim();
        System.out.print("Введите слово для поиска: ");
        String keyword = sc.nextLine().trim();

        File file = new File(filePath);
        if (!file.exists() || !file.isFile()) {
            System.err.println("Файл не найден или недоступен: " + filePath);
            return;
        }

        // Чтение файла и поиск строк
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 1;
            boolean foundAny = false;
            while ((line = reader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.printf("Строка %d: %s%n", lineNumber, line);
                    foundAny = true;
                }
                lineNumber++;
            }
            if (!foundAny) {
                System.out.println("Совпадений не найдено.");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}

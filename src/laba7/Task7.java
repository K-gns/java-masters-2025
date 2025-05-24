package laba7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Запрос имени файла и текста
        System.out.print("Введите путь к файлу: ");
        String filePath = sc.nextLine().trim();
        System.out.println("Введите текст для записи (можно несколько строк, завершите ввод пустой строкой):");

        StringBuilder sb = new StringBuilder();
        String line;
        while (true) {
            line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            sb.append(line).append(System.lineSeparator());
        }

        String text = sb.toString();
        int charsToWrite = text.length();

        // Запись в файл
        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write(text);
            System.out.println("Записано символов: " + charsToWrite);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}

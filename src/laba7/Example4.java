package laba7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        String fileName = "src/laba7/example_file.txt";

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст для записи в файл: ");
        String data = sc.nextLine();

        // Запись данных в файл с буферизацией
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Чтение данных из файла с буферизацией
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Прочитанные данные: " + line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        // Удаление файла
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("Файл удалён: " + fileName);
        } else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }
    }
}

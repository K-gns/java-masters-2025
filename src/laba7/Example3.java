package laba7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        String fileName = "src/laba7/example_file.txt";

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст для записи в файл: ");
        String data = sc.nextLine();

        // Запись данных в файл
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Чтение данных из файла
        try (FileReader reader = new FileReader(fileName)) {
            char[] buffer = new char[1024];
            int charsRead = reader.read(buffer);
            String readData = new String(buffer, 0, charsRead);
            System.out.println("Прочитанные данные: " + readData);
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

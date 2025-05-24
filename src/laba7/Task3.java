package laba7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        String fileName = "src/laba7/example_file.txt";
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Количество строк в файле: " + lineCount);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}



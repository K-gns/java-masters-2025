package laba7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        String inputFile  = "src/laba7/example_file.txt";
        String outputFile = "src/laba7/example_file_copy.txt";

        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFile)) {

            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            System.out.println("Файл скопирован успешно!");
        } catch (IOException e) {
            System.err.println("Ошибка при копировании файла: " + e.getMessage());
        }
    }
}

package laba7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Example6 {
    public static void main(String[] args) {
        String inputFileName  = "src/laba7/example6/input.txt";
        String outputFileName = "src/laba7/example6/output.txt";

        try (
                BufferedReader reader    = new BufferedReader(new FileReader(inputFileName, StandardCharsets.UTF_8));
                PrintWriter   printWriter = new PrintWriter(outputFileName, "UTF-8")
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}

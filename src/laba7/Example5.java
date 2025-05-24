package laba7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Example5 {
    public static void main(String[] args) {
        String inputFileName  = "src/laba7/example5/input.txt";
        String outputFileName = "src/laba7/example5/output.txt";

        try (
                FileInputStream  fis = new FileInputStream(inputFileName);
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader    reader = new BufferedReader(isr);

                FileOutputStream fos = new FileOutputStream(outputFileName);
                OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                BufferedWriter    writer = new BufferedWriter(osw)
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
            }
            System.out.println("Данные преобразованы и записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}

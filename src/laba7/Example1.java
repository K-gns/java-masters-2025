package laba7;

import java.io.File;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        // Создание папки
        File folder = new File("src/laba7/example_folder");
        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Папка создана: " + folder.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать папку: " + folder.getAbsolutePath());
            }
        } else {
            System.out.println("Папка уже существует: " + folder.getAbsolutePath());
        }

        // Создание файла внутри папки
        File file = new File(folder.getAbsolutePath() + File.separator + "example_file.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать файл: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }

        // Удаление файла
        if (file.delete()) {
            System.out.println("Файл удалён: " + file.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить файл: " + file.getAbsolutePath());
        }

        // Удаление папки
        if (folder.delete()) {
            System.out.println("Папка удалена: " + folder.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить папку: " + folder.getAbsolutePath());
        }
    }
}

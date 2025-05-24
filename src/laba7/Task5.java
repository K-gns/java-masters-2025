package laba7;

import java.io.File;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String path = sc.nextLine().trim();

        File file = new File(path);
        if (!file.exists()) {
            System.err.println("Файл не найден: " + path);
        } else if (!file.isFile()) {
            System.err.println("По указанному пути не файл: " + path);
        } else {
            long size = file.length();
            System.out.println("Размер файла \"" + file.getName() + "\": " + size + " байт");
        }
    }
}

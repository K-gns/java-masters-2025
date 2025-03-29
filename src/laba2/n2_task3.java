package laba2;

import java.util.Scanner;

public class n2_task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод текста для шифрования
        System.out.println("Введите текст для шифрования:");
        String inputText = scanner.nextLine();

        // Запрашиваем ключ
        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        // Шифруем текст
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            char shiftedChar = (char) (ch + key);
            encryptedText.append(shiftedChar);
        }

        // Выводим зашифрованный текст
        System.out.println("Текст после преобразования: " + encryptedText);

        // Ждем корректного ответа
        String answer;
        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("y")) {
                // Дешифруем текст, сдвигая символы обратно на значение ключа
                StringBuilder decryptedText = new StringBuilder();
                for (int i = 0; i < encryptedText.length(); i++) {
                    char ch = encryptedText.charAt(i);
                    char shiftedBackChar = (char) (ch - key);
                    decryptedText.append(shiftedBackChar);
                }
                System.out.println("Текст после обратного преобразования: " + decryptedText);
                break;
            } else if (answer.equals("n")) {
                System.out.println("Ну и ладно!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
    }
}

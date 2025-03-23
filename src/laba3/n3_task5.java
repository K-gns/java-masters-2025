package laba3;
import java.util.HashMap;
import java.util.Map;

public class n3_task5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        // Заполняем
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(5, "five");
        map.put(7, "abcdefg");
        map.put(8, "longString");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(6, "hello!!!");

        // 1) Строки с ключом > 5
        System.out.println("Строки, у которых ключ > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println("Key=" + entry.getKey() + ", Value=" + entry.getValue());
            }
        }

        // Если ключ = 0, выводим через запятую
        if (map.containsKey(0)) {
            System.out.println("Строка, где ключ=0: " + map.get(0));
        }

        // Перемножаем все ключи, где длина строки > 5
        long product = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
            }
        }
        System.out.println("Произведение всех ключей, где длина строки > 5: " + product);
    }
}

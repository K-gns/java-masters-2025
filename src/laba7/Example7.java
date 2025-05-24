package laba7;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + '\'' + ", age=" + age + '}';
    }
}

// Класс для сериализации и десериализации Person
public class Example7 {
    public static void main(String[] args) {
        String filePath = "src/laba7/person.ser";

        // Создаем объект и сериализуем его в файл
        Person person = new Person("Ivan Ivanov", 30);
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filePath))) {
            oos.writeObject(person);
            System.out.println("Объект сериализован в файл: " + filePath);
        } catch (IOException e) {
            System.err.println("Ошибка при сериализации: " + e.getMessage());
        }

        // Десериализуем объект из файла и выводим его в консоль
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filePath))) {
            Person restored = (Person) ois.readObject();
            System.out.println("Десериализованный объект: " + restored);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при десериализации: " + e.getMessage());
        }
    }
}
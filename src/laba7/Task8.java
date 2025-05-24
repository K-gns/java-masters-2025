package laba7;

import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name       = name;
        this.age        = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", department='" + department + "'}";
    }
}

public class Task8 {
    public static void main(String[] args) {
        String filePath = "src/laba7/EmployeeData.ser";

        // Создаём объект и сериализуем его в файл
        Employee emp = new Employee("Анна Петрова", 28, "Маркетинг");
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filePath))) {
            oos.writeObject(emp);
            System.out.println("Объект сохранён в файл: " + filePath);
        } catch (IOException e) {
            System.err.println("Ошибка сериализации: " + e.getMessage());
            return;
        }

        // Десериализуем объект из файла и выводим его содержимое
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filePath))) {
            Employee restored = (Employee) ois.readObject();
            System.out.println("Восстановленный объект: " + restored);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка десериализации: " + e.getMessage());
        }
    }
}

package laba2;

public class Person {
    // Поля класса
    private String name;
    private int age;
    private String gender;

    // Конструктор для инициализации всех полей
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Person: " + name + ", " + age + " лет, " + gender;
    }
}

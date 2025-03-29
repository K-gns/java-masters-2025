package laba2;

abstract class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    String breed;
    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
    void display() {
        System.out.println("Dog: " + name + ", "
                + age + " years, " + breed);
    }
}

class Cat extends Animal {
    String favoriteFood;
    Cat(String name, int age, String favoriteFood) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
    void display() {
        System.out.println("Cat: "
                + name + ", " + age
                + " years, likes " + favoriteFood);
    }
}

class Bird extends Animal {
    boolean canFly;
    Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }
    @Override
    void makeSound() {
        System.out.println("Chirp!");
    }
    void display() {
        System.out.println("Bird: "
                + name + ", " + age
                + " years, can fly: " + canFly);
    }
}


public class Animals {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Labrador");
        Cat cat = new Cat("Whiskers", 2, "Fish");
        Bird bird = new Bird("Tweety", 1, true);
        dog.display();
        dog.makeSound();
        cat.display();
        cat.makeSound();
        bird.display();
        bird.makeSound();
    }
}

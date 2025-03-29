package laba2;


abstract class AlsoShape {
    abstract double getArea();
    abstract double getPerimeter();
}

class Circle extends AlsoShape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends AlsoShape {
    double side;
    Square(double side) {
        this.side = side;
    }
    @Override
    double getArea() {
        return side * side;
    }
    @Override
    double getPerimeter() {
        return 4 * side;
    }
}

class Triangle extends AlsoShape {
    double a, b, c;
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    double getPerimeter() {
        return a + b + c;
    }
}

public class Shapes2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Circle: Area = "
                + circle.getArea() + ", Perimeter = "
                + circle.getPerimeter());
        System.out.println("Square: Area = " + square.getArea()
                + ", Perimeter = " + square.getPerimeter());
        System.out.println("Triangle: Area = "
                + triangle.getArea() + ", Perimeter = "
                + triangle.getPerimeter());
    }
}

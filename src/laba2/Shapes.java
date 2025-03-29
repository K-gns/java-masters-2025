package laba2;

interface Shape {
    double getArea();
    double getPerimeter();
}

public class Shapes {
    static class Circle implements Shape {
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        public double getArea() {
            return Math.PI * radius * radius;
        }
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    static class Square implements Shape {
        private double side;
        public Square(double side) {
            this.side = side;
        }
        public double getArea() {
            return side * side;
        }
        public double getPerimeter() {
            return 4 * side;
        }
    }

    static class Triangle implements Shape {
        private double a, b, c;
        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double getArea() {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        public double getPerimeter() {
            return a + b + c;
        }
    }
}

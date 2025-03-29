package laba2;

public class Rectangle {
    private double length;
    private double width;

    // Конструктор для инициализации длины и ширины
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle: длина = " + length + ", ширина = " + width +
                ", площадь = " + getArea() + ", периметр = " + getPerimeter();
    }
}

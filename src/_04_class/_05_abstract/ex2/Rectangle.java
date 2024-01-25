package _04_class._05_abstract.ex2;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String type, String color, int width, int height) {
        super(type, color);
        this.width = width;
        this.height = height;
    }

    @Override
    void calculateArea() {
        double result = (double)width * height;
        System.out.println("도형 넓이: " + result);
    }
}

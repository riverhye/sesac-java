package _04_class._05_abstract.ex2;

public class Circle extends Shape {
    private int radius;
    private final double PI = 3.141592;

    public Circle(String type, String color, int radius) {
        super(type, color);
        this.radius = radius;
    }


    void calculateArea() {
        double result = radius * radius * PI;
        System.out.println("도형 넓이: " + result);
    };
}

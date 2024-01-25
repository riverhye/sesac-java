package _04_class._05_abstract.ex3;

public class Triangle extends Shape {
    private int width;
    private int height;

    public Triangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public void calculateArea() {
        double result = width * height * 0.5;
        System.out.println("도형 넓이: " + result);
    }
}

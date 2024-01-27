package _04_class._05_abstract.ex3;

public class Circle extends Shape {
    private int width;
    private int height;
    @Override
    public void calculateArea() {
        System.out.println("도형 넓이: " + width * height);
    }
    public Circle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }
}

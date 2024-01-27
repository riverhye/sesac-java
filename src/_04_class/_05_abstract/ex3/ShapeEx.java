package _04_class._05_abstract.ex3;

public class ShapeEx {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("green", 49, 5);
        Circle circle = new Circle("yellow", 40, 12);

        System.out.println("=== 삼각형 정보 ===");
        triangle.getColor();
        triangle.calculateArea();
        System.out.println();

        System.out.println("=== 직사각형 정보 ===");
        circle.getColor();
        circle.calculateArea();
    }
}
package _04_class._05_abstract.ex3;

public class ShapeEx {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("green", 49, 5);
        System.out.println("=== 삼각형 정보 ===");
        triangle.calculateArea();
    }
}
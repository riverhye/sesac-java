package _04_class._05_abstract;

public class ShapeEx {
    public static void main(String[] args) {
        // abstract 클래스(Shape)는 객체를 직접 생성할 수 없지만,
        // 자식 클래스(Circle, Square)는 가능
        Circle circle = new Circle("yellow");
        Square square = new Square("green");

        circle.start();
        circle.draw();
        System.out.println("원 색상은 " + circle.getColor());

        System.out.println("====");

        square.start();
        square.draw();
        System.out.println("네모 색상은 " + square.getColor());
    }
}

package _04_class._05_abstract;

// Shape 추상 클래스 상속 받아서 구체적으로 구현
public class Circle extends Shape {
    public Circle(String color) {
        super(color);
    }

    // 선언한 추상 메서드를 구현해야 함
    void draw() {
        System.out.println("Draw Circle");
    }
}

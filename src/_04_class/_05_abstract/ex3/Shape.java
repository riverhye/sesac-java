package _04_class._05_abstract.ex3;

public abstract class Shape {
    private String color;

    // 추상 메서드 : 강제성 있음
    abstract public void calculateArea();

    public void getColor() {
        System.out.println("도형 색상: " + color);
    }

    // 생성자
    public Shape(String color) {
        this.color = color;
    }
}
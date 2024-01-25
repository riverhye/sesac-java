package _04_class._05_abstract;

public abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    // 추상 메서드 : 구현 내용이 자식 클래스마다 다를 때 사용
    // abstract 키워드, 선언만 하기(중괄호 없음)
    // 서브 클래스의 행동 강제(Override 는 선택이지만 추상 메서드는 필수)
    abstract void draw();

    // 일반 메서드
    void start() {
        System.out.println("Draw the shape!");
    }

    String getColor() {
        return color;
    }
}

package _04_class._05_abstract.ex2;

public abstract class Shape {
    private String color;
    private String type;
    public Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }

    // try 1 : 매개변수 2개 + Circle 은 매개변수로 넘기되 사용 X
    // try 2 : 각 클래스에 변수 선언했으므로 생성자에서 초기화하고, 매개변수 없이 사용해도 됨!
    abstract void calculateArea();

    void getColor() {
        System.out.println("도형 색상: " + color);
    }

    String getType() {
        return type;
    }
}

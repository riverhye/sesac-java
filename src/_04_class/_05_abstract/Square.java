package _04_class._05_abstract;

public class Square extends Shape{
    public Square(String color) {
        super(color);
    }

    void draw() {
        System.out.println("Draw Square");
    }
}

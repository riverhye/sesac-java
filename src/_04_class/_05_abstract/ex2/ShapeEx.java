package _04_class._05_abstract.ex2;

import java.util.ArrayList;

public class ShapeEx {
    public static void main(String[] args) {
        // 각 클래스를 이미 정의했으므로 따로 작성 X
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle("circle", "yellow", 5));
        shapeList.add(new Rectangle("rectangle", "green", 20, 3));

        for (Shape shape:shapeList) {
            System.out.println("=== " + shape.getType() + " 정보 ===");
            shape.getColor();
            shape.calculateArea();
            System.out.println();
        }
    }

}

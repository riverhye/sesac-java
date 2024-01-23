package _04_class;

import java.util.Scanner;

public class ClassPrac {
    public static void main(String[] args) {
        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기 기준으로 입력해 주세요.");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        // 객체 생성 -> 메서드 호출
        int area = new Rectangle(width, height).getArea();
        System.out.println(area);

        sc.close();
    }

    static class Rectangle {
        public int width;
        public int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getArea() {return width * height;}

    }
}

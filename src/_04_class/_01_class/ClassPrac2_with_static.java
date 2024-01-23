package _04_class._01_class;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassPrac2_with_static {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Rectangle2> recArray = new ArrayList<>(); // ArrayList 생성 <-- !반복문 안에 있으면 초기화

        while(true) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기 기준으로 입력해 주세요.");
            int width = sc.nextInt();
            int height = sc.nextInt();

            if(width == 0 && height == 0) {
                for (Rectangle2 recOne:recArray) {
                    System.out.printf("가로 길이는: %d", recOne.getWidth()).println();
                    System.out.printf("세로 길이는: %d", recOne.getHeight()).println();
                    System.out.printf("넓이는: %d", recOne.getArea()).println();
                    System.out.printf("---------------------").println();
                }
                // recArray의 length를 구할 게 아니라.. count 필드 선언 후 사용
                System.out.println("Rectangle 인스턴스 개수는: " + Rectangle2.getInstanceCount());
                break;
            }

            Rectangle2 rec = new Rectangle2(width); // Rectangle 객체 생성하며 width 설정

            rec.setHeight(height); // height 설정
            recArray.add(rec); // ArrayList 추가
        }
        sc.close();
    }

    static class Rectangle2 {
        private int width;
        private int height;
        private static int count = 0; // static 필드 추가

        public int getWidth() {
            return width;
        }
        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        // 생성자 - setter 로 추후 설정
        public Rectangle2(int width) {
            // 지역변수랑 필드 변수명이 동일하기 때문에 this 사용해서 필드 값에 접근
            this.width = width;
            count++;
        }

        public static int getInstanceCount() {return count;}

        public int getArea() {return width * height;}

    }
}

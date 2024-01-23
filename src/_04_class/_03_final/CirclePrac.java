package _04_class._03_final;

import java.util.Scanner;

public class CirclePrac {
    static final double PI = 3.141592;
    final int radius;
    public CirclePrac (int radius) {this.radius = radius;} // 필드 초기화

    public double calculateArea(int radius) {return radius * radius * PI;}

    public static void main(String[] args) {
        System.out.print("원의 반지름을 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        CirclePrac circle = new CirclePrac(radius); // <==
        System.out.printf("원의 반지름: %.1f", (float)circle.radius).println();
        System.out.printf("원의 넓이: %f", circle.calculateArea(radius)).println();

        sc.close();
    }
}

package _02_conditional;

public class MethodPrac1 {
    public static void main(String[] args) {
        MethodPrac1 ol = new MethodPrac1();

        ol.area(5);
        ol.area(4, 7);
        ol.area(6,3, true);
    }

    void area(int r) {
        System.out.printf("반지름이 %d인 원의 넓이: %f", r, Math.PI * r * r).println();
    };

    void area(int w, int h) {
        double convertedWH = w * h;
        System.out.printf("가로 %d, 세로 %d인 직사각형의 넓이: %.1f", w, h, convertedWH).println();
    };
    void area(int a, int h, boolean isTriangle) {
        System.out.printf("밑변 %d, 높이 %d인 삼각형의 넓이: %.1f", a, h, 0.5 * a * h).println();
    };
}

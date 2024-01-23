package _04_class._02_static;

// 클래스 사용
public class CalculatorEx {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        // Calculator 클래스의 pi 가져오기
        double circleArea = num1 * num1 * Calculator.pi;
        int plusResult = Calculator.plus(num1, num2);
        int minusResult = Calculator.minus(num1, num2);

        System.out.printf("원의 넓이: %.1f, 더하기: %d, 빼기: %d", circleArea, plusResult, minusResult);
    }
}

package _04_class._02_static;

// 클래스 생성
public class Calculator {

    static double pi = 3.141592; // 어떤 계산기든 동일해서 static 선언

    // 외부에서 주어진 값으로 처리 -> 정적 메서드가 유리
    // WHY? 메서드의 매개변수가 인스턴스 필드를 이용 안 함
    static int plus(int x, int y) {return x + y;}
    static int minus(int x, int y) {return x - y;}
}

package _05_wrapper;

// Wrapper 객체 내부 값 비교 시 기본 연산자 사용 불가(==,!=)
// -> 대신 equals()로 비교
// BUT 특정 범위에 포함되는 값은 같은 참조값이라서 가능 (포장 객체 공유)!
// Wrapper 클래스는 대부분 "parse + 기본 타입"으로 된 static 메서드 존재
// -> 기본 타입으로 변환 시 사용
public class ValueCompare {
    public static void main(String[] args) {
        // ex. 포장 객체 공유 : -128 ~ 127 사이의 값이면 연산자 사용 가능
        Integer obj1 = 100;
        Integer obj2 = 100;
        System.out.printf("%d == %d : %b%n", obj1, obj2, obj1 == obj2);
    }
}

package _04_class._07_wrapper;

public class BoxingUnboxingEx {
    public static void main(String[] args) {
        // Boxing : 기본 타입의 값을 포장 객체로 만듦
        // -> 포장 클래스 변수에 값이 대입될 때 발생
        Integer obj1 = 100;
        Double obj2 = 3.14;
        System.out.println(obj1.intValue()); // return int value
        System.out.println(obj2.doubleValue()); // return double value

        // Unboxing : 포장 객체에서 기본 타입 값을 얻음
        // -> 기본 타입 변수에 포장 객체가 대입될 때 발생
        int value1 = obj1;
        double value2 = obj2;
        System.out.println(value1);
        System.out.println(value2);
    }
}

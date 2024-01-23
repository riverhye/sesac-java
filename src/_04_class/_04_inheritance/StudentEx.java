package _04_class._04_inheritance;

public class StudentEx {
    public static void main(String[] args) {
        // 자식 객체 생성 시 부모 객체 먼저 생성됨
        Student std1 = new Student("Momo", 33);

        // Case 1. 부모 자식 클래스가 public
        // 부모 클래스에서 상속 받은 필드 값 읽기
//        System.out.println(std1.name);
//        System.out.println(std1.age);
//
//        // Person 으로 상속 받은 메서드 호출
//        std1.say();
//        std1.eat("banana");
//
//        // Student 메서드 호출
//        std1.setCampus("YongSan");

        // Case 2. 부모 자식 클래스 필드가 private 인 경우
        System.out.println(std1.getName());
        System.out.println(std1.getAge());

        // Student 필드 읽기
        std1.setCampus("영산");
        System.out.println(std1.getCampus());

        // Person 에서 상속 받은 메서드 호출
        std1.say(); // public 메서드

    }
}

package _04_class._01_class;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassEx {
    public static void main(String[] args) {
        // Student 타입의 ArrayList
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Key", 33));
        students.add(new Student("pi", 71));
        students.add(new Student("Joy", 12));

        Student stu4 = new Student("Love", 22);
        students.add(stu4);

        System.out.println(students); // 참조 주소
        // [_03_array.ArrayListEx$Student@5ca881b5, _03_array.ArrayListEx$Student@24d46ca6, _03_array.ArrayListEx$Student@4517d9a3, _03_array.ArrayListEx$Student@372f7a8d]
        System.out.println(students.size());
        Student std = students.get(0);
        // 외부 객체는 참조 변수와 dot 연산자로 필드/메서드 사용
        System.out.println("0번 학생은 " + std.getName() + ", " + std.getAge() +"세");

        for (Student student:students) {
            System.out.println(student.getName() + ", " + student.getAge() + "세");
        }
    }

    static class Student {
        // 필드(변수) : 클래스 내 값을 저장하는 변수
        // 클래스 블럭에서 선언 - 초기값 할당 안 하면 자동으로 초기화
        private String name;
        private int age;

        // 생성자 : 클래스 이름과 동일한 이름을 갖는 특별한 메서드 (리턴 타입 없음)
        // 객체 초기화
        // 객체가 생성될 때 자동 호출되는 메서드
        // 접근제한자가 public인 경우만 호출
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // 메서드 : 객체 내부 함수, 호출 시 실행
        public String getName() {return name;}
        public int getAge() {return age;}
    }

}

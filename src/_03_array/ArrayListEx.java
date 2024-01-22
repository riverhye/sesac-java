package _03_array;

import javax.xml.stream.events.StartDocument;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {
    public static void main(String[] args) {
        // Collection Framework
        // List, Set, Map, ...
        // ArrayList : 표준 배열보다 조금 느림, 많은 조작 필요한 상황에 유용, 동적 할당
        // List 컬렉션은 객체 위치를 저장 (참조 주소)

        ArrayList<Integer> numbers = new ArrayList<>();
        // 추가
        numbers.add(2);
        numbers.add(5);
        numbers.add(19);

        // 변경
        numbers.set(1, 4);
        System.out.println(numbers);

        // 찾기
        System.out.println("첫번째 요소 " + numbers.get(0));

        // 삭제
        numbers.remove(2);

        numbers.add(0, 9);

        System.out.println(numbers);

        // ArrayList 연결
        // 단 asList로 생성한 배열은 크기 변경 불가
        numbers.addAll(Arrays.asList(44, 22, 8));
        System.out.println(numbers);

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
        System.out.println("0번 학생은 " + std.getName() + ", " + std.getAge() +"세");

        for (Student student:students) {
            System.out.println(student.getName() + ", " + student.getAge() + "세");
        }

        // ArrayList로 만든 배열 요소를 보려면, toArray()로!
        System.out.println(Arrays.toString(numbers.toArray()));
    }

    static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {return name;}
        public int getAge() {return age;}
    }
}

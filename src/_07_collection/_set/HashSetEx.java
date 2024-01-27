package _07_collection._set;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("apple");
        set1.add("banana");
        set1.add("kiwi");
        set1.add("banana"); // 중복 객체는 저장 X
        System.out.println(set1);

        int size1 = set1.size();
        System.out.printf("총 %d 종류의 과일이 있습니다. %n%n", size1);

        // Course 클래스
        Set<Course> set2 = new HashSet<>();
        Course java = new Course(101, "java");
        Course js1 = new Course(102, "js");
        Course js2 = new Course(102, "js");
        System.out.println(java.hashCode());
        System.out.println(js1.hashCode());
        System.out.println(js2.hashCode());
        System.out.println(js1.equals(js2));

        set2.add(java);
        set2.add(js1);
        set2.add(js2); // 인스턴스는 달라도 동일 값이라서 객체 1개만 저장됨

        // 저장된 객체 개수 출력
        int size2 = set2.size();
        System.out.printf("총 %d 종류의 과정이 있습니다. %n%n", size2); // 2

        // 전체 요소 출력
        // Case 1. 반복문
        System.out.println("=== 반복문으로 Set 객체 출력 ===");
        for(Course c:set2) {
            System.out.println(c);
        }
        System.out.println();

        // Case 2. iterator() 로 반복자를 얻어서 객체 하나씩 가져오기
        // iterator (반복자)가 제공하는 메서드
        // - hasNext() : return boolean
        // - next() : return E(요소 반환)
        // - remove() : void
        Iterator<Course> iterator = set2.iterator();
        while (iterator.hasNext()) {
            Course c = iterator.next();
        }
    }
}
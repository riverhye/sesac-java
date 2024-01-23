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

        // ArrayList로 만든 배열 요소를 보려면, toArray()로!
        System.out.println(Arrays.toString(numbers.toArray()));
    }
}
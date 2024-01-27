package _07_collection._list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List; // List import

public class LinkedListEx {
    public static void main(String[] args) {
        // ArrayList 컬렉션 객체 생성
        List<String> list1 = new ArrayList<>();

        // LinkedList 컬렉션 객체 생성
        List<String> list2 = new LinkedList<>();

        // 시작 끝 변수 선언하여 시간 차 확인
        long startTime;
        long endTime;

        // ArrayList 0번 인덱스에 데이터 10,000번 반복 추가
        startTime = System.nanoTime(); // 나노 단위(ms)로 속도 체크
        for(int i=0; i<10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 소요시간 : " + (endTime - startTime));

        // LinkedList 0번 인덱스에 데이터 10,000번 추가
        startTime = System.nanoTime(); // 나노 단위(ms)로 속도 체크
        for(int i=0; i<10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 소요시간 : " + (endTime - startTime));

        // ArrayList 소요시간 : 4885200
        // LinkedList 소요시간 : 771300

        // LinkedList 가 요소 추가를 왜 더 빠르게 처리할까?
        // => ArrayList 는 0번 인덱스에 새로운 요소를 추가하면서 기존 요소 인덱스를 한 칸씩 뒤로 밀어냄
    }
}

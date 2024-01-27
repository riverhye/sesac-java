package _07_collection._ex;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {
        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");
        System.out.print("정수 입력: ");

        Scanner sc = new Scanner(System.in);
        Set<Integer> intSet = new HashSet<>();

        while(true) {
            int input = sc.nextInt();

            if(input == -1) {
                System.out.println("중복 제거된 정수 목록 : " + intSet);
                break;
            }
            System.out.print("정수 입력: ");
            intSet.add(input);
        }

        sc.close();
    }
}
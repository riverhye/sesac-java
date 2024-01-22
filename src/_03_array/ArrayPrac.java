package _03_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[5]; // 크기가 5인 배열 생성
        int sum =  0;
        for(int i = 0; i<numArr.length; i++) {
            numArr[i] = sc.nextInt(); // 입력값 할당
            sum += numArr[i];
        }
        double sumD = sum;

         System.out.println("평균은 " + sumD/numArr.length);
    }
}

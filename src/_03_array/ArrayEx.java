package _03_array;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        // 배열 : 처음 선언한 크기 변경 불가
        int[] temp = null;
        // System.out.println(temp); // null
        // System.out.println(temp[0]); // NullPointerException

        // 1. 값 목록으로 배열 선언과 생성
        int[] intArr = {14, 2, 4, 533, 6};
        System.out.println(intArr); // 참조값 [I@36baf30c
        System.out.println(intArr[3]);
        // 특정 값 변경
        intArr[1] = 200;
        System.out.println(intArr[1]);

        // 배열 변수 선언 시점과 "중괄호로 감싼" 값 목록 대입 시점이 다름 -> new 타입[]
        char [] charArr;
        charArr = new char[]{'a', 'b', 'c'}; // 작따 : char, 큰따 : String

        // 2. new 연산자로 배열 선언과 생성
        // 배열 생성 시 기본값으로 초기화
        double[] doubleArr = new double[3];
        System.out.println(doubleArr[2]); // new 연산자로 초기화 됨

        doubleArr[0] = 3.4;
        doubleArr[1] = 5.2;
        doubleArr[2] = 2.3;

        System.out.println(doubleArr[2]);

        // 배열 길이 : ReadOnly!
        System.out.println(doubleArr.length);

        // 배열 출력 : toString
        System.out.println(Arrays.toString(doubleArr));

        // 다차원 배열
        int[][] matrix = {{1,2,3}, {4,5,6}};
        int[][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 4;
        matrix2[1][1] = 5;
        matrix2[2][0] = 7;
        matrix2[2][1] = 8;
        System.out.println(Arrays.toString(matrix2));
    }
}

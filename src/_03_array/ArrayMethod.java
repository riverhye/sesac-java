package _03_array;

import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        // arraycopy
        String[] originalFruits = {"apple", "banana", "kiwi"};
        String[] newFruits = new String[5];

        // 원본 배열, 원본 배열 시작 인덱스 넘버, 복사할 새 배열, 새 배열이 복사 시작할 인덱스 넘버, 복사할 원본 배열의 길이
        System.arraycopy(originalFruits, 0, newFruits, 0, originalFruits.length - 1);
        System.out.println(Arrays.toString(newFruits));

        int[] originalNumbers = {1,2,3,4,5};

        // copyOf
        // 복사할 배열, 복사할 배열 길이
        int[] copyNumbers = Arrays.copyOf(originalNumbers, 2);
        System.out.println(Arrays.toString(copyNumbers));

        // copyOfRange
        // 복사할 배열, 어디부터, 어디까지
        int[] rangeArray = Arrays.copyOfRange(originalNumbers, 0, 3);
        System.out.println(Arrays.toString(rangeArray));

        // fill
        int[] filledArray = new int[5];
        System.out.println(Arrays.toString(filledArray));
        // 채울 배열, 채울 값
        Arrays.fill(filledArray, 99);
        System.out.println(Arrays.toString(filledArray));

        // sort
        int[] unsortedArray = {56, 9, 32, 1, 7};
        Arrays.sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));

           }
}

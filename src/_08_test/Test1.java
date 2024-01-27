package _08_test;

import java.util.ArrayList;

public class Test1 {
    public static int sumLessThan(int[] nums, int compareInt) {
        ArrayList<Integer> newNums = new ArrayList<>();
        for(int num:nums) {
            if(num < compareInt) {
                newNums.add(num);
            }
        }

        int result = 0;

        for(int i=0; i<newNums.size(); i++) {
            result += newNums.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 5, 8, 3, 7};
        System.out.println(sumLessThan(nums1, 5));
    }
}
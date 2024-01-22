package _02_conditional;

import java.util.Scanner;

public class LoopPrac1 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        for (String a:arr) {
            System.out.println("a: " + a);
        }

        System.out.println("숫자를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;

        // ver 1. while
        while(i<=number) {
            System.out.print(i + " ");
            i++;
        }

        // ver 2. do-while
        do {
            System.out.print(i + " ");
            i++;
        } while (i<=number);

        // ver 3. for
        for(int j=1; j<=number; i++) {
            System.out.print(j + " ");
            j++;
        }

        sc.close();
    }
}

package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> str = new ArrayList<>();

        // while 문
        while (true) {
            System.out.println("문자를 입력해 주세요.");
            String text = sc.nextLine();

            if (text.equals("exit")) {
                for (String val : str) {
                    System.out.println(val);
                }
                break;

            }

            str.add(text);

        }

        // do while 문
//        String input;
//        do {
//            System.out.println("문자를 입력해 주세요.");
//            input = sc.nextLine();
//
//            if(input.equals("exit")) {
//                for (String val: str) {
//                    System.out.println(val);
//                }
//            }
//                    str.add(input);
//
//        } while (!input.equals("exit"));

        sc.close();
    }
}

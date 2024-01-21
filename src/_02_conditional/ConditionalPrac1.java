package _02_conditional;

import java.util.Scanner;

public class ConditionalPrac1 {
    public static void main(String[] args) {
        System.out.println("이름을 입력하세요.");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        // if else 문
        if(name.equals("홍길동")) {
            System.out.println("남자");
        } else if (name.equals("성춘향")) {
            System.out.println("여자");
        } else {
            System.out.println("모르겠어요.");
        }

        // switch case 문
        // ver 1.
//        switch (name) {
//            case "홍길동":
//                System.out.println("남자");
//                break;
//            case "성춘향":
//                System.out.println("여자");
//                break;
//            default:
//                System.out.println("모르겠어요.");
//        }

        // ver 2.
        final String nameResult = switch (name) {
            case "홍길동" -> "man";
            case "성춘향" -> "woman";
            default -> "모르겠어요.";
        };
        System.out.println(nameResult);

        sc.close();
    }
}

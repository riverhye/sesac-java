package _01_syntax;

import java.util.Scanner;

public class PrintInAndOut {
    public static void main(String[] args) {
        System.out.println("성함, 키, 노동 여부를 빈칸으로 구분하여 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int height = scanner.nextInt();
        boolean isWorking = scanner.nextBoolean();

        System.out.println("성함: " + name);
        System.out.println("키: " + height);
        System.out.println("노동 여부: " + isWorking);

        scanner.close();

    }
}

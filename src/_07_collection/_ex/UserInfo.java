package _07_collection._ex;

import java.util.*;

public class UserInfo {
    public static void main(String[] args) {
        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mapUserInfo = new LinkedHashMap<>();

        while(true) {
            System.out.print("이름 입력: ");
            String name = sc.nextLine();

            if(name.equals("종료")) {
                break;
            }

            System.out.print("나이 입력: ");
            int age = sc.nextInt();
            // while 문에서 두 개의 값을 순차적으로 입력 받으려면?
            // nextLine 으로 buffer 비워줌
            sc.nextLine();

            // 이미 존재하는 이름이면 나이 갱신됨
            mapUserInfo.put(name, age);
        }

        System.out.println("== 입력 받은 이름과 나이 목록 ==");
        // Ver1. Map.Entry 를 for each 돌리기
        // for (Map.Entry<> entry: 생성한 Map.entrySet()) {}
        for (Map.Entry<String, Integer> entry: mapUserInfo.entrySet()) {
            System.out.println("이름: " + entry.getKey() + ", 나이: " + entry.getValue());
        }

        // Ver2. Set 객체에 담아서 Iterator
        // Set<Map.Entry<>> idf = 생성한 map.entrySet();
        // Iterator<Map.Entry<>> idf2 = idf.iterator();
        // while (~~.hasNext()) {}
//        Set<Map.Entry<String, Integer>> userInfo = mapUserInfo.entrySet();
//        Iterator<Map.Entry<String, Integer>> userIterator = userInfo.iterator();
//        while (userIterator.hasNext()) {
//            Map.Entry<String, Integer> entry = userIterator.next();
//            String name = entry.getKey();
//            int age = entry.getValue();
//            System.out.println("이름: " + name + ", 나이: " + age);
//        }

        sc.close();
    }
}

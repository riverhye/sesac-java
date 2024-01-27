package _07_collection._map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        // 'id: name' 인 HashMap

        // Map 컬렉션 생성 및 객체 저장
        Map<Integer, String> map = new HashMap<>();
        map.put(199, "이름1");
        map.put(322, "이름2");
        map.put(1212, "이름3");
        map.put(888, "이름4");

        int size = map.size();
        System.out.printf("총 %d명의 사람이 있습니다. %n", size);

        // key 로 value 얻기
        int key = 199;
        String value = map.get(key);
        System.out.printf("%d번은 %s입니다. %n%n", key, value);

        // key 와 value 로 구성된 모든 Map.Entry 객체를 Set 에 담아 리턴
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println(entrySet);

        // Entry<Integer, String> 으로 작성 시 import Entry
        Iterator<Map.Entry<Integer, String>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, String> entry = entryIterator.next();
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.printf("%s의 번호는 %d %n", v, k);
        }

        // 키 Set collection 을 얻고, 이를 반복해서 키와 값 얻기
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);

        // 주어진 키와 일치하는 entry 삭제
        String deletedValue = map.remove(key);
        System.out.printf("%s 삭제됨. %n", deletedValue);
    }
}

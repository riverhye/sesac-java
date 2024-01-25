package _04_class._08_generic;

import java.util.ArrayList;

// 제네릭 클래스
class CustomListGeneric<T> {
    ArrayList<T> list = new ArrayList<>();
    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    // list 의 index 를 리턴하므로 반환 타입 T
    public T get(int i) {
        return list.get(i);
    }

    // 기본적으로 있는 toString 메서드 오버라이딩
    @Override
    public String toString() {
        return "CustomListGeneric = " + list;
    }
}
public class GenericEx {
    public static void main(String[] args) {
        CustomListGeneric<Integer> genericLi1 = new CustomListGeneric<>();
        genericLi1.addElement(1);
        genericLi1.addElement(44);
        genericLi1.removeElement(1);
        System.out.println(genericLi1.toString());

        Integer el = genericLi1.get(0);
        System.out.println(el);

        CustomListGeneric<Character> characterLi = new CustomListGeneric<>();
        characterLi.addElement('A');
        characterLi.addElement('B');
        System.out.println(characterLi.toString());
    }
}

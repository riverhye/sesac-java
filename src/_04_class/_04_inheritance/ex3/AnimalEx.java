package _04_class._04_inheritance.ex3;

public class AnimalEx {
    public static void main(String[] args) {
        Cat cat = new Cat("연님", 5);
        Dog dog = new Dog("태평", 6);

        // 인스턴스 값 출력 :
        System.out.println(cat.toString());
        // static 변수는 인스턴스 없이 생성자로 호출 가능
        Cat.move();

        System.out.println(dog.toString());
        Dog.move();
    }
}

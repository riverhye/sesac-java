package _04_class._04_inheritance.ex1;

public class AnimalEx {
    public static void main(String[] args) {
            Cat cat = new Cat("삼색", 5);
            Dog dog = new Dog("태평", 7);

        System.out.println("고양이 ---");
        System.out.println("종: " + cat.getSpecies());
        System.out.println("이름: " + cat.getName());
        System.out.println("나이: " + cat.getAge());
        cat.makeSound();

        System.out.println("강아지 ---");
        System.out.println("종: " + dog.getSpecies());
        System.out.println("이름: " + dog.getName());
        System.out.println("나이: " + dog.getAge());
        dog.makeSound();
    }
}

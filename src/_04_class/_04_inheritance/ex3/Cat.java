package _04_class._04_inheritance.ex3;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super("고양이", name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("미야오옹~");
    }

    public static void move() {
        System.out.println("자박 자박");
    }
}

package _04_class._04_inheritance.ex3;

public class Dog extends Animal {
    public Dog (String name, int age) {
        super("강아지", name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("왈왈왈!");
    }

    public static void move() {
        System.out.println("챡 챡 챡");
    }
}

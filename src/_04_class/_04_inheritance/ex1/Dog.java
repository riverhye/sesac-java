package _04_class._04_inheritance.ex1;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super("강아지", name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("왈왈");
    }
}

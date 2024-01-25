package _04_class._04_inheritance.ex1;

class Cat extends Animal {
    public Cat(String name, int age) {
        super("고양이", name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("미야옹");
    }
}

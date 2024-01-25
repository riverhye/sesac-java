package _04_class._04_inheritance.ex3;

public class Animal {
    private String species;
    private String name;
    private int age;

    public void makeSound() {
        System.out.println("동물 소리");
    }

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return species + " 이름은 " + name + ", 나이는 " + age;
    }

}

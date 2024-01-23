package _04_class._04_inheritance;

public class Dog extends Animal {
    public Dog(String species, String name, int age) {
        setSpecies(species);
        setName(name);
        setAge(age);
    }

    @Override
    public void makeSound() {
        System.out.println("왈왈");
    }
}

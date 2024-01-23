package _04_class._04_inheritance;

public class Cat extends Animal {
    public Cat(String species, String name, int age) {
        setSpecies(species);
        setName(name);
        setAge(age);
    }

    @Override
    public void makeSound() {
        System.out.println("미야옹");
    }
}

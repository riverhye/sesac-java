package _04_class._04_inheritance.ex1;

public class Animal {
    private String species;
    private String name;
    private int age;

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
       return species;
    }

    public void makeSound() {
        System.out.println("동물은 소리를 낸다.");
    }
}

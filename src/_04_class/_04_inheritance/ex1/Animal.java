package _04_class._04_inheritance.ex1;

public class Animal {
    private String species;
    private String name;
    private int age;

    public Animal(String species, String name, int age) {
        // private 으로 선언했지만 같은 패키지라서 this 접근 가능
        // 생성자로 초기화
        this.species = species;
        this.name = name;
        this.age = age;
    }

    // 출력용 getter (변수가 모두 private 이므로)
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

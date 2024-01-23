package _04_class._04_inheritance;

import java.util.Scanner;

public class AnimalEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("강아지 고양이?");
        String species = sc.next();
        System.out.println("이름과 나이를 띄어쓰기 기준으로 입력하세요");
        String name = sc.next();
        int age = sc.nextInt();

        if(species.equals("고양이")) {
            Cat cat1 = new Cat("고양이", name, age);
            System.out.println(cat1.getSpecies() + ", " + cat1.getAge() + "세");
            cat1.makeSound();
        } else if(species.equals("강아지")) {
            Dog dog1 = new Dog("강아지", name, age);
            System.out.println(dog1.getSpecies() + ", " + dog1.getAge() + "세");
            dog1.makeSound();
        } else {
            System.out.println("땡");
        }

        sc.close();
    }
}

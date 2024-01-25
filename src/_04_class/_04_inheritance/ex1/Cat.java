package _04_class._04_inheritance.ex1;

class Cat extends Animal {
    public Cat(String name, int age) {
        // Animal 클래스의 생성자 호출
        // -> 매개변수가 있으므로 super 호출하여 초기화
        super("고양이", name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("미야옹");
    }
}

package _04_class._04_inheritance;

public class Person {
    // Case 1. 부모 필드가 public
//    public String name;
//    public int age;

    // -- super() --
    // 2-1. 부모 클래스가 기본 생성자를 가진 경우
    //    public Person() {
    //        System.out.println("부모 클래스 Person() 생성자 실행");
    //    }

    // 2-2. 부모 클래스가 매개변수가 있는 생성자를 가진 경우
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//        System.out.println("부모 클래스 Person(name, age) 생성자 실행");
//    }
//    public void say() {
//        System.out.println("hello");
//    }
//    public void eat(String food) {
//        System.out.println("yummy " + food);
//    }

    // Case 2. 부모 필드가 private 인 경우 : getter, setter 로 접근
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void say() {
        System.out.println("hello!");
    }
}

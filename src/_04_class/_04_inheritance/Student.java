package _04_class._04_inheritance;

public class Student extends Person {
    // Case 1. 자식 필드가 public
//    public String campus;

//    public Student(String name, int age) {
        // 2-1. 부모 클래스가 기본 생성자
        // super() // 부모 기본 생성자(매개변수 X)를 호출하는 super 이 생략됨 (컴파일시 자동 추가)
        // this.name = name;
        // this.age = age;

        // 2-2. 부모 클래스가 매개변수 가진 생성자
//        super(name, age);
//        System.out.println("자식 클래스 Student(name, age) 생성자 실행");
//    }
//    public void setCampus(String campus) {
//        this.campus = campus;
//        System.out.println("Studying at " + campus +" campus");
//    }

        // Case 2. 필드가 private 인 경우
        private String campus;
        public Student(String name, int age) {
            setAge(age);
            setName(name);
        }

        public String getCampus() {
            return campus;
        }

        public void setCampus(String campus) {
            this.campus = campus;
            System.out.println(campus + "에서 공부 중");
        }

        // 메서드 오버라이딩
    @Override // 어노테이션 (생략 가능)
        public void say() {
            System.out.println("helllllo!!");
        }

}

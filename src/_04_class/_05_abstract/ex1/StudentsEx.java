package _04_class._05_abstract.ex1;

public class StudentsEx {
    public static void main(String[] args) {
        Kim kim = new Kim("김미미", "바비", 18, 20180022);
        Baek baek = new Baek("백미", "쌀밥", 19, 20170330);

        System.out.println("=== " + kim.getName() + " 학생 정보 ===");
        System.out.println("학교: " + kim.getSchool());
        System.out.println("나이: " + kim.getAge());
        System.out.println("학번: " + kim.getStudentID());
        System.out.print("점심은 ");
        kim.todo();
        System.out.println();

        System.out.println("=== " + baek.getName() + " 학생 정보 ===");
        System.out.println("학교: " + baek.getSchool());
        System.out.println("나이: " + baek.getAge());
        System.out.println("학번: " + baek.getStudentID());
        System.out.print("점심은 ");
        baek.todo();

    }
}

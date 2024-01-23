package _04_class._04_final;

public class Student {
    // Ver1. 필드 선언 시 초기화
    final String campus = "용산";

    // Ver2. 생성자에서 초기화
     final String sid;

     public Student(String sid) {
         this.sid = sid;
     }

    public static void main(String[] args) {
         // 두 필드를 출력
        Student std1 = new Student("s001");
        System.out.println(std1.campus);
        System.out.println(std1.sid);
    }
}

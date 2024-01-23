package _04_class._02_static;

public class StudentPrac {
    public static void main(String[] args) {

    }

    class Student {
        private String name;
        private int student_ID;
        private int grade;
        private static int totalStudents;

        public void getName(String name) {
            this.name = name;
        }
        public void getGrade(int grade) {
            this.grade = grade;
        }
        public  void getStudentId(int student_ID) {
            this.student_ID = student_ID;
        }

        public String setName() {return name;}
        public int setGrade() {return grade;}
        public int setStudentId() {return student_ID;}

        // 생성자 : 필드 초기화
        public Student(String name, int student_ID, int grade) {
            this.name = name;
            this.student_ID = student_ID;
            this.grade = grade;
            totalStudents++;
        }

        public void displayInfo() {
            System.out.println("=== 학생 정보 ===");
            System.out.println("이름: " + name);
            System.out.println("학번: " + student_ID);
            System.out.println("학년: " + grade);
        }

        public static int getTotalStudents() {return totalStudents;}
    }
}

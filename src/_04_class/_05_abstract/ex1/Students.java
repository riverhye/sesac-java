package _04_class._05_abstract.ex1;

public abstract class Students {
    private String name;
    private String school;
    private int age;
    private int studentID;

    public Students (String name, String school, int age, int studentID) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }
    public String getSchool() {
        return school + " 고등학교";
    }
    public int getAge() {
        return age;
    }
    public int getStudentID() {
        return studentID;
    }

    abstract void todo();
}

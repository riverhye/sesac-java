package _07_collection._set;

public class Course {
    private int id;
    private String title;

    public Course(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // id, title 값이 같으면 동일한 hashCode return
    // hashCode : 객체의 메모리 주소를 기반으로 한 정수 값
    // hashCode() : Object 클래스(모든 객체의 최상위 클래스)에 정의된, 객체의 해시 코드를 반환하는 메서드
    // 클래스에서 hashCode() 재정의 : 객체 내부 상태를 기반으로 고유한 해시 코드 생성 가능

    @Override
    public int hashCode() {
        // String 인 title 은 hasCode() 로 int 변경
        // id 는 int 라서 정수 값의 해시 코드에 더하기
        return title.hashCode() + id;
    }

    @Override
    public boolean equals(Object obj) {
        // Course 객체 : Course target
        if(obj instanceof Course target) {
            // int 는 == 비교
            // String 은 wrapper 객체라서 equals 로 비교
            return target.id == id && target.title.equals(title);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Course {" + "id = " + id + ", " + "title = " + title + "}";
    }
}

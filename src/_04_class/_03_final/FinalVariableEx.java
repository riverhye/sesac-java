package _04_class._03_final;

public class FinalVariableEx {
    public static void main(String[] args) {
        // final 선언 및 초기화 (ReadOnly)
        final int finalNumber = 10;

        // 값 변경 시 컴파일 오류 ex. finalNumber = 4;
        System.out.println(finalNumber);
    }
}

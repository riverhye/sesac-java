package _04_class._06_interface;

// interface 선언
public interface RemoteControl {
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    // 상수 필드 : public static final (생략해도 컴파일 중에 자동 기입)
    // 대문자와 언더바로
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 1;
}

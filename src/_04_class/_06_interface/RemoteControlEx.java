package _04_class._06_interface;

public class RemoteControlEx {
    public static void main(String[] args) {
        // interface is a one of types, so you can use it as a type of variable
        // reference type can assign "null"
        RemoteControl rc;

        // Television 객체 대입
        rc = new Television(); // RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // Audio 객체 대입 (참조 대상 변경)
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();
    }
}

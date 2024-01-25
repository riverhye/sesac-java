package _04_class._06_interface;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        // interface 상수 필드로 volume 필드 값 제한
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }
}

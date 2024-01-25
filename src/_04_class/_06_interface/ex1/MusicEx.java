package _04_class._06_interface.ex1;

public class MusicEx {
    public static void main(String[] args) {
        Music music;

        // 생성자 초기화할 때 String song 매개변수로 넘김
        music = new Mp3Player("Don't Look Back In Anger");
        music.getType();
        music.play();
        music.stop();

        System.out.println();

        music = new CdPlayer("Morning Glory?");
        music.getType();
        music.play();
        music.stop();

    }
}

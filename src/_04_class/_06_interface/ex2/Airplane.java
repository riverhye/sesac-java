package _04_class._06_interface.ex2;

public class Airplane extends Vehicle implements Flyable {
    public Airplane(String name, int maxSpeed) {
        setName(name);
        setMaxSpeed(maxSpeed);
    }

    @Override
    void move() {
        System.out.println(getName() + ", 하늘을 날아가는 중");
    }

    @Override
    public void fly() {
        System.out.println(getName() + ", 고도 " + getMaxSpeed() + "피트에서 비행 중");
    }
}

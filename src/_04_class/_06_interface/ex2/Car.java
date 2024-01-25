package _04_class._06_interface.ex2;

public class Car extends Vehicle {
    public Car(String name, int maxSpeed) {
        setName(name);
        setMaxSpeed(maxSpeed);
    }

    @Override
    public void move() {
        System.out.println(getName() + ", " + getMaxSpeed() + " 속도로 도로를 따라 이동 중");
    }
}

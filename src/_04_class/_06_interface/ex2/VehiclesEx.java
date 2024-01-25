package _04_class._06_interface.ex2;

import java.util.ArrayList;

public class VehiclesEx {
    public static void main(String[] args) {
        // Ver1. ArrayList
//        ArrayList<Vehicle> vehicles = new ArrayList<>();
//        Flyable fly = new Airplane("카타르항공", 450);
//        Car car = new Car("부릉", 200);
//
//        vehicles.add(car);
//        vehicles.add((Vehicle) fly);

        // Ver2. 일반 배열
        Vehicle[] vehicles = new Vehicle[2];
        Car car = new Car("부릉", 200);
        vehicles[0] = car;
        Airplane airplane = new Airplane("카타르 항공", 440);
        vehicles[1] = airplane;

        // 배열 순회 출력
        for (Vehicle vehicle:vehicles) {
            vehicle.move();
            if(vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly();
            }
        }
    }
}

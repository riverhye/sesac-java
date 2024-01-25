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
            System.out.println(vehicle instanceof  Flyable);
            if(vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly(); // 형변환(캐스팅)으로 fly 실행
            }
        }

        // 캐스팅은 up(상위 클래스로) down(하위 클래스로)이 존재
        // DownCasting 상위 -> 하위 : () 명시
        // UpCasting 하위 -> 상위 : 생략 가능
    }
}

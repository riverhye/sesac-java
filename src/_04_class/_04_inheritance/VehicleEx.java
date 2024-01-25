package _04_class._04_inheritance;

public class VehicleEx {
    public static void main(String[] args) {
        VehicleBicycle bicycle = new VehicleBicycle("class C", "따릉이", 2018, "green");
        VehicleCar car = new VehicleCar("class B", "xc40", 2023, "gray");
        VehicleTruck truck = new VehicleTruck("class A", "porter 2", 2003, "blue");

        System.out.println("== 자동차 ==");
        System.out.println("car: " + car.toString());
        car.engineOn();
        car.parking();
        car.engineOff();

        System.out.println("== 자전거 ==");
        System.out.println("bicycle: " + bicycle.toString());
        bicycle.rideStart();
        bicycle.riding();
        bicycle.rideStop();

        System.out.println("== 트럭 ==");
        System.out.println("truck: " + truck.toString());
        truck.engineOn();
        truck.parking();
        truck.engineOff();


    }
}

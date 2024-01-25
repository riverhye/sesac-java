package _04_class._04_inheritance;

public class VehicleTruck extends VehicleCar{

    // 부모 클래스가 매개변수 가짐
    public VehicleTruck(String licenseType, String model, int year, String color) {
        super(licenseType, model, year, color);
    }
}

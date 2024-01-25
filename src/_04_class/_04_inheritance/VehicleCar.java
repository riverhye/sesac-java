package _04_class._04_inheritance;

public class VehicleCar extends Vehicle {
//    private final boolean;

    public VehicleCar(String licenseType, String model, int year, String color) {
        setLicenseType(licenseType);
        setModel(model);
        setColor(color);
        setYear(year);
    }

    public void engineOn () {
        System.out.println("시동을 겁니다.");
    }

    public void engineOff () {
        System.out.println("시동을 끕니다.");
    }
}

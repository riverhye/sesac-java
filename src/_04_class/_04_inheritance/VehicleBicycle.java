package _04_class._04_inheritance;

public class VehicleBicycle extends Vehicle {
    private final boolean hasOwnSeoul = true;

    public boolean madeBySeoul() {
        return hasOwnSeoul;
    }
    public VehicleBicycle(String licenseType, String model, int year, String color) {
        setLicenseType("class C");
        setModel("따릉이");
        setColor("green");
        setYear(2018);
    }
}

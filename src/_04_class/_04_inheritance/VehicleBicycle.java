package _04_class._04_inheritance;

public class VehicleBicycle extends Vehicle {
    private final boolean hasOwnSeoul = true;

    public boolean madeBySeoul() {
        return hasOwnSeoul;
    }
    public VehicleBicycle(String licenseType, String model, int year, String color) {
        setLicenseType(licenseType);
        setModel(model);
        setColor(color);
        setYear(year);
    }
}

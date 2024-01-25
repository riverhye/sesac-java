package _04_class._04_inheritance;

public class VehicleCar extends Vehicle {
    private boolean converible;

    public boolean isConverible() {
        return converible;
    }

    public void setConverible(boolean converible) {
        this.converible = converible;
    }

    public VehicleCar(String licenseType, String model, int year, String color) {
        setLicenseType(licenseType);
        setModel(model);
        setColor(color);
        setYear(year);
        setConverible(true);
    }

    public void engineOn () {
        System.out.println("시동을 겁니다.");
    }

    public void engineOff () {
        System.out.println("시동을 끕니다.");
    }

    public void parking() {
        System.out.println("주차 완");
    }

    @Override
    public String toString() {
        return ("model = " + getModel() + ", licenseType = " + getLicenseType() + ", year = " + getYear() + ", color = " + getColor() + ", isConvertible = " + isConverible());
    }
}

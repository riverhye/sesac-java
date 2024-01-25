package _04_class._04_inheritance;

public class VehicleBicycle extends Vehicle {

    private boolean hasOwnSeoul;

    public VehicleBicycle(String licenseType, String model, int year, String color) {
        setLicenseType(licenseType);
        setModel(model);
        setColor(color);
        setYear(year);
        setHasOwnSeoul(true);
    }
    public boolean isHasOwnSeoul() {
        return hasOwnSeoul;
    }

    public void setHasOwnSeoul(boolean hasOwnSeoul) {
        this.hasOwnSeoul = hasOwnSeoul;
    }

    public void rideStart() {
        System.out.println("페달을 밟습니다.");
    }
    public void riding() {
        System.out.println("두 바퀴가 굴러갑니다.");
    }

    public void rideStop() {
        System.out.println("페달 밟기를 멈춥니다.");
    }

    @Override
    public String toString() {
        return ("model = " + getModel() + ", licenseType = " + getLicenseType() + ", year = " + getYear() + ", color = " + getColor() + ", madeBySeoul = " + isHasOwnSeoul());
    }
}

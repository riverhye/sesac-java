package _04_class._04_inheritance;

public class VehicleTruck extends VehicleCar{
    private boolean hasClutch;

    public boolean isHasClutch() {
        return hasClutch;
    }

    public void setHasClutch(boolean hasClutch) {
        this.hasClutch = hasClutch;
    }

    // 부모 클래스가 매개변수 가짐
    public VehicleTruck(String licenseType, String model, int year, String color) {
        super(licenseType, model, year, color);
        setHasClutch(true);
    }

    @Override
    public void parking() {
        System.out.println("클러치를 밟고 주차 완");
    }

    @Override
    public String toString() {
        return ("model = " + getModel() + ", licenseType = " + getLicenseType() + ", year = " + getYear() + ", color = " + getColor() + ", hasClutch = " + isHasClutch());
    }

}

package _06_generic._ex;

public class Calculator<T extends  Number> {
    private T num1;
    private T num2;
    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static void main(String[] args) {
        Calculator<Integer> integerCalculator = new Calculator<Integer>(10, 5);
        System.out.printf("Integer Sum: %.1f", integerCalculator.add()).println();
        Calculator<Double> doubleCalculator = new Calculator<Double>(3.214223, 4.25332);
        System.out.println("Double Sum: " + doubleCalculator.add());
    }
}

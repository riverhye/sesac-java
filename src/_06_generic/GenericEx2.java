package _06_generic;
// Number 클래스 : 자바의 모든 숫자 형식의 부모 클래스 (정수, 실수, ...)

// 제네릭 제한 : Number 상속한 클래스만 허용
class Box<T extends Number> {
    private T item;
    public void setItem(T item) {
        this.item = item;
    }
}

// interface 선언
interface Movable {
    void move();
}

// interface 사용
class Car implements Movable {
   public void move() {
       System.out.println("자동차 출발~!");
    }
}

// interface 구현한 객체만 허용
class Container<T extends Movable> {
    private T item;
    public Container(T item) {
        this.item = item;
    }
        public void makeItMove() {
        item.move();
    }
}

public class GenericEx2 {
    public static void main(String[] args) {
        Box<Double> doubleBox = new Box<>();
        doubleBox.setItem(63.323);

        // 생성자 매개변수에 Car 객체 넣음 : new Car()
        Container<Car> carContainer = new Container<>(new Car());
        carContainer.makeItMove();
    }
}

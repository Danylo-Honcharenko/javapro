class Car {
    String print() {
        return "Broom, broom";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.print());
    }
}
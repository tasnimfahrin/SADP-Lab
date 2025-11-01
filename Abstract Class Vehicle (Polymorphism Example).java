abstract class Vehicle {
    abstract void drive();
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a car");
    }
}

class Truck extends Vehicle {
    void drive() {
        System.out.println("Driving a truck");
    }
}

class Motorcycle extends Vehicle {
    void drive() {
        System.out.println("Driving a motorcycle");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Truck(), new Motorcycle() };

        for (Vehicle v : vehicles) {
            v.drive();  // demonstrates polymorphism
        }
    }
}

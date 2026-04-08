abstract class Vehicle {
    abstract void wheel();

    void door() {
        System.out.println("Vehicle has doors");
    }
}

public class Vehicleandbus extends Vehicle {
    void wheel() {
        System.out.println("Bus has 6 wheels");
    }

    public static void main(String[] args) {
        Vehicleandbus b = new Vehicleandbus();
        b.wheel();
        b.door();
    }
}
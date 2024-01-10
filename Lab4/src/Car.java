class Car extends Vehicle {
    boolean isConvertible;

    Car(String make, String model, int year, boolean isConvertible) {
        super(make, model, year);
        this.isConvertible = isConvertible;
    }

    void startEngine() {
        System.out.println("Car engine started");
    }

    void startEngine(String ignitionType) {
        System.out.println("Car engine started with " + ignitionType);
    }
}
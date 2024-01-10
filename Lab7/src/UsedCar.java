class UsedCar implements Comparable<UsedCar> {
    private String make;
    private String model;
    private int year;
    private double price;

    public UsedCar(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Implementing Comparable interface based on car price
    @Override
    public int compareTo(UsedCar otherCar) {
        return Double.compare(this.price, otherCar.price);
    }

    @Override
    public String toString() {
        return String.format("%d %s %s - $%.2f", year, make, model, price);
    }
}

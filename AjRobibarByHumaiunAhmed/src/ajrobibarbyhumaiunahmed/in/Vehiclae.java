package ajrobibarbyhumaiunahmed.in;

public class Vehiclae {

    int speed;
    double regularPrice;
    String color;

    public Vehiclae() {
    }

    public Vehiclae(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}

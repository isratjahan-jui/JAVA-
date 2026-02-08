package practiceclassobject.calculation;

public class POS {

    public double calculateFinalPrice(double unitPrice, double quantity) {
        double grossPrice = unitPrice * quantity;
        double discount = 0;
        if (grossPrice <= 100) {
            discount = grossPrice - (grossPrice * 0.02);
        } else if (grossPrice <= 200) {
            discount = grossPrice - (grossPrice * 0.03);
        } else if (grossPrice <= 400) {
            discount = grossPrice - (grossPrice * 0.04);
        } else {
            discount = grossPrice - (grossPrice * 0.05);
        }

        return discount;
    }

    //switch 
    public double calculateFinalPrice1(double unitPrice, double quantity) {
        double grossPrice = unitPrice * quantity;

        int category = (grossPrice <= 100) ? 1
                : (grossPrice <= 200) ? 2
                        : (grossPrice <= 400) ? 3 : 4;

        return switch (category) {
            case 1 ->
                grossPrice - (grossPrice * 0.02);
            case 2 ->
                grossPrice - (grossPrice * 0.03);
            case 3 ->
                grossPrice - (grossPrice * 0.04);
            default ->
                grossPrice - (grossPrice * 0.05);
        };
    }

    // Range limit array
    private static final double[] LIMITS = {100, 200, 400, Double.MAX_VALUE};
    // Corresponding discount rates
    private static final double[] RATES = {0.2, 0.3, 0.4, 0.5};

    public double calculateFinalPrice2(double unitPrice, double quantity) {
        double grossPrice = unitPrice * quantity;
        double rate = 0;

        for (int i = 0; i < LIMITS.length; i++) {
            if (grossPrice <= LIMITS[i]) {
                rate = RATES[i];
                break;
            }
        }

        return grossPrice * rate;
    }
}

package rafael.falconi;

public class Decimals {

    private double decimal, hundredth;

    public Decimals(double decimal, double hundredth) {
        this.decimal = decimal;
        this.hundredth = hundredth;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public double getHundredth() {
        return hundredth;
    }

    public void setHundredth(double hundredth) {
        this.hundredth = hundredth;
    }

    public double transformDecilmalsToUnitrs() {
        return 100 * (this.decimal + this.hundredth);
    }

    public double subtract() {
        return this.decimal - this.hundredth;
    }

}

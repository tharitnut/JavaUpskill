/*
 * 2.PercantageDiscountPolicy Class
 * This class apply %-based discount.
 */

public class PercentageDiscountPolicy implements DiscountPolicy {

    private int percent;

    public PercentageDiscountPolicy(int percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100.");
        }
        this.percent = percent;
    }

    @Override
    public double applyDiscount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount can't be below 0.");
        }
        return amount * (1 - percent / 100.0);
    }

    @Override
    public String toString() {
        return percent + "%";
    }
}

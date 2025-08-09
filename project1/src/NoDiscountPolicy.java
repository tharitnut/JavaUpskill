/*
 * 3.NoDiscountPolicy Class
 */

public class NoDiscountPolicy implements DiscountPolicy {

    @Override
    public double applyDiscount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount can't be below 0.");
        }
        return amount;
    }

    @Override
    public String toString() {
        return "No Discount";
    }

}

public class VIPBonusDiscountPolicy implements DiscountPolicy {
    private int basePercent; // Base discount
    private int bonusPercent; // Additional discount if threshold is exceeded
    private double bonusThreshold; // Threshold for bonus discount

    public VIPBonusDiscountPolicy(int basePercent, int bonusPercent, double bonusThreshold) {
        if (basePercent < 0 || basePercent > 100) {
            throw new IllegalArgumentException("Base Percentage must be between 0 and 100.");
        }
        if (bonusPercent < 0 || bonusPercent > 100) {
            throw new IllegalArgumentException("Bonus Percentage must be between 0 and 100.");
        }
        if (bonusThreshold < 0) {
            throw new IllegalArgumentException("Bonus Threshold must be non-negative.");
        }
        this.basePercent = basePercent;
        this.bonusPercent = bonusPercent;
        this.bonusThreshold = bonusThreshold;
    }

    @Override
    public double applyDiscount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount can't be negative");
        }
        int totalPercent = basePercent;
        if (amount > bonusThreshold) {
            totalPercent += bonusPercent;
        }
        if (totalPercent > 100) {
            totalPercent = 100;
        }
        return amount * (1 - totalPercent / 100.0);
    }

    @Override
    public String toString() {
        return String.format("%d base + %d bonus over %.2f", basePercent, bonusPercent, bonusThreshold);
    }
}

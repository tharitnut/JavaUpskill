/*
 * 6. Invoice Class
 * This class represent an Invoice, linking a customer to a total amount.
 */

// Composition concept
public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        if (id < 0) {
            throw new IllegalArgumentException("Customer ID must be positive.");
        }
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        if (amount < 0) {
            throw new IllegalArgumentException("Amount can't be below 0");
        }
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount can't be below 0");
        }
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    // public double getCustomerDiscount() {
    // return customer.getDiscount();
    // }

    // Core business logic: apply the customer's discount policy
    public double getAmountAfterDiscount() {
        return this.customer.getDiscountPolicy().applyDiscount(amount);
    }

    @Override
    public String toString() {
        return "Invoice{ id= " + id + ", customerId" + getCustomerId() +
                ", customerName= " + getCustomerName() +
                ", originalAmout= " + String.format("%.2f", amount) +
                ", discountAmout= " + String.format("%.2f", getAmountAfterDiscount());
    }
}

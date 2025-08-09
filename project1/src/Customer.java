/*
 * 5.Customer Class
 * It has a "has-a" relationship with DicountPolicy
 * This Class represent a customer with an ID, name and a DiscountPolicy
 */

public class Customer {
    private int id;
    private String name;
    private DiscountPolicy discountPolicy;

    /*
     * Constructor for create Customer object
     * 
     * @param id not negative
     * 
     * @param name not null
     * 
     * @param discont 0-100
     * 
     * @throws IllegalArg
     */
    public Customer(int id, String name, DiscountPolicy discountPolicy) {
        if (id < 0) {
            throw new IllegalArgumentException("Customer ID must be positive.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name mustn't be blank.");
        }
        if (discountPolicy == null) {
            throw new IllegalArgumentException("Customer must have a discount policy.");
        }
        this.id = id;
        this.name = name;
        this.discountPolicy = discountPolicy;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public DiscountPolicy getDiscountPolicy() {
        return this.discountPolicy;
    }

    public void setDiscount(DiscountPolicy policy) {
        if (policy == null) {
            throw new IllegalArgumentException("Customer must have a discount policy.");
        }
        this.discountPolicy = policy;
    }

    @Override
    public String toString() {
        return "Customer{id= " + id + ", name= " + name + ", discountPolicy= " + discountPolicy + "}";
    }
}

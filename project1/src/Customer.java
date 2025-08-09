public class Customer {
    private int id;
    private String name;
    private int discount;

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
    public Customer(int id, String name, int discount) {
        if (id < 0) {
            throw new IllegalArgumentException("Customer ID must be positive.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name mustn't be blank.");
        }
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Discont percentage must be between 0 and 100.");
        }
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Discont percentage must be between 0 and 100.");
        }
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("%s(%d)(%d%%)", name, id, discount);
    }
}

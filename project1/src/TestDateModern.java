public class TestDateModern {
    public static void main(String[] args) {
        // create and print Date
        DateModern d1 = new DateModern(2025, 2, 8);
        System.out.println("Original Date: " + d1);

        // use a chain of with method to create a modified copy
        DateModern d2 = d1.withDate(2012, 12, 23);
        System.out.println("New Date(from chain): " + d2);
        System.out.println("Year is " + d2.getYear());
        System.out.println("Month is " + d2.getMonth());
        System.out.println("Day is " + d2.getDay());

        // show that d1 is unchanged
        System.out.println("Original Date(d1) is still: " + d1);
    }
}

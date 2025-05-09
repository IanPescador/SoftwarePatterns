public class RentalTestDrive {
    public static void main(String[] args) {
        Movie movie1 = new Movie("The Matrix", Movie.REGULAR);
        Movie movie2 = new Movie("The Matrix Reloaded", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("Cars", Movie.CHILDREN);

        Rental rental = new Rental(movie1, 5);
        Rental rental2 = new Rental(movie2, 3);
        Rental rental3 = new Rental(movie3, 4);

        Customer customer = new Customer("John Doe");

        customer.addRental(rental);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.println("Customer: " + customer.getName());
        
        System.out.println(customer.statement());
    }
}
import java.util.Enumeration;

public class Customer {
    private String _name;
    private java.util.Vector _rentals = new java.util.Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public Enumeration getRentals() {
        return _rentals.elements();
    }

    public String statement() {
        return new TextStatement().value(this);
    }

    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }

    public double getTotalCharge() {
        double result = 0;
        Enumeration rentals = getRentals();

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }

        return result;
    }

    public double getTotalFrequentRenterPoints() {
        double result = 0;
        Enumeration rentals = getRentals();

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }

        return result;
    }
}

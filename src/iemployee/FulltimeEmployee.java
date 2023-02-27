package iemployee;

public class FulltimeEmployee extends Employee{
    public FulltimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return 8 * paymentPerHour;
    }
}

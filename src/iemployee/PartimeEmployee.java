package iemployee;

public class PartimeEmployee extends Employee{
    int workingHours;

    public PartimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return workingHours * paymentPerHour;
    }
}

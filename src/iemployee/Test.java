package iemployee;

public class Test {
    static iEmployee employee1 = new PartimeEmployee("ABC 1", 4, 5);
    static iEmployee employee2 = new PartimeEmployee("ABC 2", 5, 3);
    static iEmployee employee3 = new FulltimeEmployee("ABC Full", 7);
    static iEmployee[] list = {employee1, employee2, employee3};
    public static void main(String[]args){
        for(iEmployee employee: list){
            System.out.println("Name:" + employee.getName());
            System.out.println("Salary:" + employee.calculateSalary());
            System.out.println("\n");
        }
    }
}

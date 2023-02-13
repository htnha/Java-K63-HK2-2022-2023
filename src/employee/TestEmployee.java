package employee;

public class TestEmployee {
    public static void main(String[]args){
        Employee employee1 = new Employee(7, "Hoa Mai 4", 1000000);
        Employee employee3 = new Employee(4, "Hoa Mai 1", 5000000);
        Employee employee4 = new Employee(5, "Hoa Mai 2", 3000000);
        Employee employee5 = new Employee(6, "Hoa Mai 3", 7000000);
        Employee[] list = {employee1, employee3, employee4, employee5};
        for (Employee employ: list
             ) {
            employ.insertData();
        }
    }
}

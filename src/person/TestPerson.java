package person;

public class TestPerson {
    public static void main(String[]args){
        Person student1 = new Student("Cuong", 22, "Ba Dong", 4);
        student1.setName("ABC");
        Person teacher1 = new Teacher("Nha", 38, "Dong Hoi", 5000000);
        Person[] list = {student1, teacher1};
        for (Person person: list
             ) {
            person.display();
        }
    }
}

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor de clase
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName + lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int newSalary) {
        salary = newSalary;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Aumentamos el salario multiplicandolo por un porcentaje
    public int raiseSalary(int percent) {
        salary = salary + (salary*percent/100);
        return salary;
    }
    public String toString() {
        return "Employee[id=" + id + " , name=" + firstName +" "+ lastName + ",salary=" + salary + "]";
    }
}

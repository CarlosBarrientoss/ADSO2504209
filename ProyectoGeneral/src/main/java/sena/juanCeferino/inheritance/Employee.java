package sena.juanCeferino.inheritance;

public class Employee extends Person {
    private int idEmployee;
    private double salary;
    private static int employeeCounter = 0;

    public Employee() {
        super();
        this.idEmployee = ++employeeCounter;
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
        this.idEmployee = ++employeeCounter;
    }

    public Employee(String name, char gender, int age, String address, double salary){
        super(name, gender, age, address);
        this.salary = salary;
        this.idEmployee = ++employeeCounter;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("""
                                                    ID: %d
                                                    Salary: %.2f 
                                                    """);
        sb.append(super.toString());
        String employeeInfo = String.format(sb.toString(), this.idEmployee, this.salary);

        return employeeInfo;
    }
}

public abstract class Employee {
    private final String pis;
    private final String name;
    private final String lastName;
    private Double salary;

    public Employee(String pis, String name, String lastName, Double salary) {
        this.pis = pis;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public abstract double calcPayment();

    public Double getSalary() {
        return salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPis() {
        return pis;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "pis='" + pis + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", payment=" + this.calcPayment() +
                '}';
    }
}

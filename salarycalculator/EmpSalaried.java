public class EmpSalaried extends Employee {

    public EmpSalaried(String pis, String name, String lastName, Double salary) {
        super(pis, name, lastName, salary);
    }

    @Override
    public double calcPayment() {
        return this.getSalary();
    }


}

import java.util.Scanner;

public class EmpSalCom extends Employee {
    private double salesPrice;

    public EmpSalCom(String pis, String name, String lastName, Double salary, double salesPrice) {
        super(pis, name, lastName, salary);
        this.salesPrice = salesPrice;
    }

    @Override
    public double calcPayment() {
        return this.salesPrice*0.05+getSalary();
    }

    public void condicionalpayment() {
        System.out.println("What is total of sales "+ getName() + " " + getLastName() + " n° of pis: " + getPis() + " ?");
        Scanner sc = new Scanner(System.in);
        this.salesPrice = sc.nextDouble();
    }

}

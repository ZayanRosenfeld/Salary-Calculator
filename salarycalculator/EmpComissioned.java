import java.util.Scanner;

public class EmpComissioned extends Employee{
    private Double salesPrice;
    public EmpComissioned(String pis, String name, String lastName,Double salesPrice) {
        super(pis, name, lastName, null);
        this.salesPrice = salesPrice;
    }

    @Override
    public double calcPayment() {
        return this.salesPrice*0.05;
    }

    public void condicionalpayment() {
        System.out.println("What is total number of sales "+ getName() + " " + getLastName() + " n° of pis: " + getPis() + " ?");
        Scanner sc = new Scanner(System.in);
        this.salesPrice = sc.nextDouble();
    }
}

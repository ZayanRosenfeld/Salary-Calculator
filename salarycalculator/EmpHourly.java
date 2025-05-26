import java.util.Scanner;

public class EmpHourly extends Employee{
    private Double workHours;
    public EmpHourly(String pis, String name, String lastName, Double salary, Double workHours) {
        super(pis, name, lastName, salary);
        this.workHours = workHours;
    }



    @Override
    public double calcPayment() {
        double hourPrice = getSalary()/40;
        double extraHourPrice = hourPrice*1.5;
        double payment;
        if(workHours >= 40){
            payment = (this.workHours-40)*extraHourPrice + getSalary();
        }
        else{
            payment = hourPrice*this.workHours;
        }
        return payment;
    }

    public void condicionalpayment() {
    System.out.println("How much hours "+ getName() + " " + getLastName() + " n° of pis: " + getPis() + " Worked ?");
        Scanner sc = new Scanner(System.in);
        this.workHours = sc.nextDouble();
    }
}

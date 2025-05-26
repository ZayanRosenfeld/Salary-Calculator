import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Payday!!! ---");
        EmpSalaried[] fa = new EmpSalaried[2];
        EmpHourly[] fh = new EmpHourly[2];
        EmpComissioned[] fc = new EmpComissioned[2];
        EmpSalCom[] fac = new EmpSalCom[2];


        // 2 Funcionários Assalariados
        fa[0] = new EmpSalaried("11111111101", "Ryan", "Gosling", 3000.00);
        fa[1] = new EmpSalaried("11111111102", "Evandro", "Martelo", 3500.00);
        fh[0] = new EmpHourly("11111111103", "João", "Bosco", 3000.00,80.0);
        fh[1] = new EmpHourly("11111111104", "Ewerton", "Ribeiro", 3500.00,30.0);
        fc[0] = new EmpComissioned("11111111105", "Anderson", "Barbosa", 10.00);
        fc[1] = new EmpComissioned("11111111106", "Grigorev", "Zayan", 10.00);
        fac[0] = new EmpSalCom("11111111107", "Galba", "Alface", 3800.00,10.00);
        fac[1] = new EmpSalCom("11111111108", "Luiz", "Laguardia", 3100.00,10.00);

        System.out.println("Filling of payment list ");
        for (EmpHourly i : fh) {
            i.condicionalpayment();
        }
        for (EmpComissioned i : fc) {
            i.condicionalpayment();
        }
        for (EmpSalCom i : fac) {
            i.condicionalpayment();
        }




        System.out.println("------------- List of Payment -------------");
        System.out.println("--------- Salaried Employees ----------");
        for (EmpSalaried i : fa) {
            System.out.println(i);
        }
        System.out.println("----------- Houred Employees ------------");
        for (EmpHourly i : fh) {
            System.out.println(i);
        }
        System.out.println("-------- Comissioned Employees ---------");
        for (EmpComissioned i : fc) {
            System.out.println(i);
        }
        System.out.println("-- Comissioned/Salaried Employees --");
        for (EmpSalCom i : fac) {
            System.out.println("Want to give them a bonus of 10% ? y/n");
            Scanner sc = new Scanner(System.in);
            if (sc.nextLine().equalsIgnoreCase("y")) {
                i.setSalary(i.getSalary()*1.1);
            }
            System.out.println(i);
        }
    }
}
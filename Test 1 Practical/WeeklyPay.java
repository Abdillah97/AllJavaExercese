import java.util.Scanner;
public class WeeklyPay{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------");

        System.out.print("Enter your ID: ");
        String ID = sc.nextLine();

        System.out.print("Enter hourly rate of pay: ");
        int hrp = sc.nextInt();

        System.out.print("Enter hours worked in week: ");
        int hw = sc.nextInt();

        int Rh = hw;
        int Oh = 0;
        int Rp = hw * hrp;
        int Op = 0;

        if(hw > 40){
            Rh = 40;
            Oh = hw - Rh;
            Rp = Rh * hrp;
            Op = Oh * hrp * 3 / 2;
        }

        int grossPay = Rp + Op;
        int deductions = 20;
        if(grossPay > 500){
            deductions += (grossPay * 15 / 100);
        }
        int netPay = grossPay - deductions;

        System.out.println("\nEmployee's ID: " + ID);
        System.out.println("Regular Hours Worked: " + Rh + "hrs");
        System.out.println("OverTime Hours: " + Oh + "hrs");
        System.out.println("Regular Pay: $" + Rp);
        System.out.println("OverTime Pay: $" + Op);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions: $" + deductions);
        System.out.println("Net Pay: $" + netPay);

        System.out.println("---------------------------------------------------------------");
    }
}

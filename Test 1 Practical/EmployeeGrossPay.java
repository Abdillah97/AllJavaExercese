import java.util.Scanner;
public class EmployeeGrossPay{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------------------------");

        System.out.print("Enter an anually earns: ");
        int GrossPay = sc.nextInt();

        int TwicePayPerMonth = GrossPay / 24;
        int Bi_WeeklyPay = GrossPay / 26;

        System.out.println("\nTwice Gross Pay monthly: "+TwicePayPerMonth);
        System.out.println("Bi-weekly Gross Pay : "+Bi_WeeklyPay);

        System.out.println("--------------------------------------------------------");
    }
}

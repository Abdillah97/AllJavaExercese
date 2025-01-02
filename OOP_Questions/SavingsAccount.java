public class SavingsAccount{
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest(){
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double Rate){
        annualInterestRate = Rate;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        System.out.println("\nSaver1 initial Balance: " + saver1.getSavingsBalance());
        System.out.println("Saver2 initial Balance: " + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nONE YEAR AFTER ,FOR THE RATE OF 4%:");
        System.out.println("Saver1 Balance: " + saver1.getSavingsBalance());
        System.out.println("Saver2 Balance: " + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("\nANOTHER YEAR AFTER, FOR THE RATE OF 5%:");
        System.out.println("Saver1 Balance: " + saver1.getSavingsBalance());
        System.out.println("Saver2 Balance: " + saver2.getSavingsBalance() + "\n");
    }
}

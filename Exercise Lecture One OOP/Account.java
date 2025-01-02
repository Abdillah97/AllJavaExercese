public class Account{
    private int accountBalance;

    public Account(int initialBalance){
        if(initialBalance >= 0){
            accountBalance = initialBalance;
        }else{
            accountBalance = 0;
            System.out.println("Initial Balance is invalid!");
        }
    }

    public void credit(int amount){
        accountBalance += amount;
    }

    public void debit(int amount){
        if(amount > accountBalance){
            System.out.println("Debit amount exceeded account accountBalance!");
        }else{
            accountBalance -= amount;
        }
    }

    public int getBalance(){
        return accountBalance;
    }

    public static void main(String[] args){
        Account a1 = new Account(1000);
        Account a2 = new Account(-500);

        System.out.println("\nFor object 1:");
        System.out.println("initial balance: " + a1.getBalance());
        a1.credit(200);
        System.out.println("Account Balance after credit: " + a1.getBalance());
        a1.debit(100);
        System.out.println("Account Balance after debit: " + a1.getBalance());

        System.out.println("\nFor object 2:");
        System.out.println("initial balance: " + a2.getBalance());
        a2.credit(200);
        System.out.println("Account Balance after credit: " + a2.getBalance());
        a2.debit(300);
        System.out.println("Account Balance after debit: " + a2.getBalance());
    }
}

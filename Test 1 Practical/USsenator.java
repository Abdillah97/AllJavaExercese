import java.util.Scanner;
public class USsenator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------");
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your years of citizenship: ");
        int citizenshipYears = sc.nextInt();

        if(age >= 30){
            if(citizenshipYears >= 9){
                System.out.println("\nYou are eligible to be a US Senator");
            }else{
                System.out.println("\nYou are NOT eligible to be a US Senator");
            }
        }else if(age >= 25){
            if(citizenshipYears >= 7){
                System.out.println("\nYou are eligible to be a US Representative");
            }else{
                System.out.println("\nYou are NOT eligible to be US representative");
            }
        }else{
            System.out.println("\nYou NEITHER eligible to be Senate NOR House representative");
        }

        System.out.println("---------------------------------------------------------------");
    }
}

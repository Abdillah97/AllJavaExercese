import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------");

        System.out.print("Enter a five-digit number: ");
        String n = sc.nextLine();

        while(n.length() != 5){
            System.out.print("INVALID LEGNTH!, Enter a five-digit number: ");
            n = sc.nextLine();
        }

        int number = Integer.valueOf(n);

        int digit1 = number / 10000;
        int digit2 = (number / 1000) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;

        int ReversedNumber = (digit5 * 10000) + (digit4 * 1000) + (digit3 * 100) + (digit2 * 10) + digit1;

        if(number == ReversedNumber){
            System.out.println("\nNumber "+number + " is a palindrome");
        }else{
            System.out.println("\nNumber "+number + " is not a palindrome");
        }

        System.out.println("---------------------------------------------------------------");
    }
}

import java.util.Scanner;
public class GuessingGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------------------");

        int MyNumber,Guess;
        MyNumber=78;

        System.out.print("Guess my secret number: ");
        Guess=sc.nextInt();

        while(Guess != MyNumber){
            if(Guess > MyNumber){
                System.out.print("Too high,Try again: ");
                Guess=sc.nextInt();
            }else{
                System.out.print("Too low!,try again: ");
                Guess=sc.nextInt();
            }
        }
        System.out.println("\nCongratulation!,You guesed the number ("+MyNumber+").");
        System.out.println("--------------------------------------------------------");
    }
}

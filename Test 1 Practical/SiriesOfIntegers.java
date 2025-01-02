import java.util.Scanner;
public class SiriesOfIntegers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------");

        int number = 0;
        int maximum = 0;
        int minimum = 0;

        while(number != -99){
            if(number == -99){
                break;
            }
            System.out.print("Enter siries of integer or enter -99 to stop ");
            number = sc.nextInt();
            
            if(number > maximum){
                maximum = number;
            }
            if(number != -99){
                if(number < minimum){
                    minimum = number;
                } 
            }
        }
        System.out.println("\nLargest number: "+maximum+"\nSmallest number: "+minimum);
        System.out.println("----------------------------------------------");
    }
}

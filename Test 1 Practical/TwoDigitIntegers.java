import java.util.Scanner;
public class TwoDigitIntegers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------------");

        int x,y;
        System.out.print("Enter two digit integer: ");
        String save=sc.nextLine();
        while((save.length() != 2) || (Integer.valueOf(save)%10 == 0)){

            if(save.length() != 2){
                System.out.print("invalid length!,enter two digit integer: ");
                save=sc.nextLine();
            }else{
                System.out.print("make sure the rightmost digit is non-zero,\nenter two digit integer: ");
                save=sc.nextLine();
            }

        }

        x = Integer.valueOf(save);
        y = (x%10)*10 + (x/10);
        int result = x + y;

        System.out.println("\nYour number: "+x);
        System.out.println("Your number reversed: "+y);
        System.out.println("Your number + reversed: "+result);
        System.out.println("----------------------------------------------");
        
    }
}

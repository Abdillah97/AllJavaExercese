import java.util.Scanner;
public class SumOfPositiveNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");

        int number=0;
        int sum = 0;

        while(number>=0){
            System.out.print("Enter positive number to sum(or negative number to terminate):");
            number = sc.nextInt();
            if(number>=0){
                sum += number;
            }
        }
        System.out.println("\nThe total sumation of intered positive numbers is: "+sum);

        System.out.println("-----------------------------------------------------------------");
    }
}

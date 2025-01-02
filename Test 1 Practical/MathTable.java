import java.util.Scanner;
public class MathTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------------------------");

        System.out.print("Enter any number to display math table: ");
        int number = sc.nextInt();

        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        
        System.out.println("--------------------------------------------------------");
    }
}

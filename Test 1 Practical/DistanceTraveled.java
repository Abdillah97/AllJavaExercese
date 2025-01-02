import java.util.Scanner;
public class DistanceTraveled{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("***************************************************");

        System.out.print("What is the speed of the vehicle in mph?: ");
        int speed = sc.nextInt();

        System.out.print("How many hours has it traveled?: ");
        int time = sc.nextInt();

        System.out.println("\n+-------+-----------------------+");
        System.out.println("|  Hour\t| Distance Traveled \t|");
        System.out.println("+-------+-----------------------+");

        for(int t = 1; t <= time; t++){
            System.out.println("|  "+t+"\t|\t"+t * speed+"\t\t|");
        }

        System.out.println("+-------+-----------------------+");

        System.out.println("\n****************************************************");

        
    }
}

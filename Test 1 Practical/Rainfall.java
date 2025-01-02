import java.util.Scanner;
public class Rainfall{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------------------------");

        System.out.print("How many years your want to calculate total rainfall: ");
        int years = sc.nextInt();

        String[] months = {"january","February","March","April","May","June",
        "July","August","September","October","November","December"};

        double TotalRainfall = 0;
        int numberOfMonths = 0;
        double avg;
        
        for(int i = 1; i <= years; i++){
            System.out.println("\nYEAR "+i+":");
            for(int j = 1;j <= 12; j++){
                System.out.print("Enter the inches of rainfall for "+months[j-1]+": ");
                double Rainfall = sc.nextInt();

                TotalRainfall += Rainfall;
                numberOfMonths++;
            }
        }
        
        avg = TotalRainfall/numberOfMonths;
        
        System.out.println("\nNumber of months: "+numberOfMonths+" Months");
        System.out.println("Total inches of Rainfall: "+TotalRainfall+" inches");
        System.out.println("Average  rainfall per month for the entire period: "+avg+" inches/month");

        System.out.println("------------------------------------------------------------------");
    }
}

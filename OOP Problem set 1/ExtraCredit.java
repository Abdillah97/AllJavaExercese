import java.util.Scanner;
public class ExtraCredit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------");
        
        double WeightedAverage = 0;

        System.out.print("Enter list of grades(separate by space): ");
        String putGr=sc.nextLine();
        String[] grades = putGr.split(" ");

        System.out.print("Now Enter list of grades weight(separate by space): ");
        String putWt=sc.nextLine();
        String[] weights = putWt.split(" ");

        while(grades.length != weights.length){
            System.out.println("invalid length!,You enter many or few weights according to grades");
            System.out.print("Enter grade weight again(separate by space): ");
            putWt=sc.nextLine();
            weights = putWt.split(" ");
        }

        for(int i = 0; i < grades.length; i++){
            int grade = Integer.valueOf(grades[i]);
            double weight = Double.valueOf(weights[i]);
            WeightedAverage += (grade*weight);
        }
        System.out.println("\nThe average of the grades: "+WeightedAverage);

        System.out.println("-------------------------------------------------------");
    }
}

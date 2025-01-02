import java.util.Scanner;
public class GradeCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------");

        int average;
        int sum = 0;
        System.out.print("Enter list of grades(separate by space): ");
        String put=sc.nextLine();

        String[] grades = put.split(" ");

        for(String grade : grades){
            int g = Integer.valueOf(grade);
            sum+=g;
        }
        average = sum/grades.length;
        System.out.println("\nThe average of the grades: "+average);

        System.out.println("-----------------------------------------");
    }
}

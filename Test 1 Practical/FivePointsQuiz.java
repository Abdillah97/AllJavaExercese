import java.util.Scanner;
public class FivePointsQuiz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------------------------");

        System.out.print("Enter a quiz score: ");
        int score = sc.nextInt();
        String grade = "";

        switch(score){
            case 5:
                grade = "A";
                break;
            case 4:
                grade = "B";
                break;
            case 3:
                grade = "C";
                break;
            case 2:
                grade = "D";
                break;
            case 1:
                grade = "F";
                break;
            case 0:
                grade = "F";
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
        if(!grade.isEmpty()){
            System.out.println("GRADE: "+grade);
        }
        System.out.println("------------------------------------------------------------------");
    }
}

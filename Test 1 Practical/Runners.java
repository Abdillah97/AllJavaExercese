import java.util.Scanner;
public class Runners{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****************************************************************");

        System.out.print("Enter name of first runner: ");
        String firstRunnerName = sc.nextLine();

        System.out.print("Enter name of second runner: ");
        String secondRunnerName = sc.nextLine();

        System.out.print("Enter name of third runner: ");
        String thirdRunnerName = sc.nextLine();

        String[] runnerNames = {firstRunnerName,secondRunnerName,thirdRunnerName};
        int[] runnerTimes = new int[3];

        System.out.println("\nOKY,NOW:- ");

        for(int i = 0; i < runnerNames.length; i++) {
            System.out.print("Enter finished time in minutes for " + runnerNames[i] + ": ");
            runnerTimes[i] = sc.nextInt();
        }

        int minTime = runnerTimes[0];
        int maxTime = runnerTimes[0];
        int middleTime = 0;
        String firstRunner = "", secondRunner = "", thirdRunner = "";

        for(int i = 0; i < runnerTimes.length; i++) {
            if(runnerTimes[i] <= minTime) {
                minTime = runnerTimes[i];
                firstRunner = runnerNames[i];
            }
            if(runnerTimes[i] >= maxTime) {
                maxTime = runnerTimes[i];
                thirdRunner = runnerNames[i];
            }
        }

        for(int i = 0; i < runnerTimes.length; i++) {
            if(runnerTimes[i] != minTime && runnerTimes[i] != maxTime) {
                middleTime = runnerTimes[i];
                secondRunner = runnerNames[i];
            }
        }
        String[] RUNNERS = {firstRunner,secondRunner,thirdRunner},p={"1st","2nd","3rd"}; 
        int[] TIME = {minTime,middleTime,maxTime};

        System.out.println("\n+---------------+---------------+----------------+");
        System.out.println("| POSITION\t| RUNNERS\t| TIME FINISHED  |");
        System.out.println("+---------------+---------------+----------------+");

        for(int i = 0; i < RUNNERS.length; i++){
            System.out.println("| "+ p[i] +"\t\t| "+RUNNERS[i]+"\t\t| "+TIME[i]+ " minutes \t |");
        }
        System.out.println("+---------------+---------------+----------------+\n");

        System.out.println("****************************************************************");
    }
}

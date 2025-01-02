public class MotorBoat{
    private double capacity;
    private double amount;
    private double MaxSpeed;
    private double CurrentSpeed;
    private double efficiency;
    private double distance;

    public MotorBoat(double c,double a,double ms,double cs,double e){
        capacity =c;
        amount = a;
        MaxSpeed = ms;
        CurrentSpeed = cs;
        efficiency = e;
        distance = 0;
    }
    public double getMaxDistance(int time){
        return MaxSpeed * time;
    }
    public double getMinDistance(int time){
        return CurrentSpeed * time;
    }
    public static void main(String[] args){
        MotorBoat M1 = new MotorBoat(12.0,1000.0,180,60,15.0);
        System.out.println("\ndistance travell with curent speed: "+M1.getMinDistance(12));
        System.out.println("distance travell with Maximum speed: "+M1.getMaxDistance(12));
    }
}

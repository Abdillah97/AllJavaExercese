public class Employee{
    private String firstName;
    private String lastName;
    private int monthlySalary;

    public Employee(String firstName, String lastName, int monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        if(monthlySalary >= 0){
            this.monthlySalary =  monthlySalary;
        }else{
            this.monthlySalary = 0;
        }
        
    }

    public int getYearlySalary(){
        return monthlySalary * 12;
    }

    public void giveRaise(double percentage){
        monthlySalary += monthlySalary * percentage / 100;
    }

    public static void main(String[] args){
        Employee emp1 = new Employee("abdillah", "mohd", 4000);
        Employee emp2 = new Employee("khalid", "khamis", -5000);

        System.out.println("Yearly Salary (Emp1): " + emp1.getYearlySalary());
        System.out.println("Yearly Salary (Emp2): " + emp2.getYearlySalary());

        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("Yearly Salary After Raise (Emp1): " + emp1.getYearlySalary());
        System.out.println("Yearly Salary After Raise (Emp2): " + emp2.getYearlySalary());
    }
}

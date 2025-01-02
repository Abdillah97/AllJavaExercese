public class Employee{
    private String firstName;
    private String lastName;
    private int monthlySalary;

    public Employee(String firstName, String lastName, int monthlySalary){
        setFirstName(firstName);
        setLastName(lastName);
        setMonthlySalary(monthlySalary);
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setMonthlySalary(int monthlySalary){
        if(monthlySalary >= 0){
            this.monthlySalary =  monthlySalary;
        }else{
            this.monthlySalary = 0;
        } 
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getMonthlySalary(){
        return monthlySalary;
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

        System.out.println("First name (Emp1): " + emp1.getFirstName());
        System.out.println("First name (Emp2): " + emp2.getFirstName());
        System.out.println("Yearly Salary (Emp1): " + emp1.getLastName());
        System.out.println("Yearly Salary (Emp2): " + emp2.getLastName());
        System.out.println("Yearly Salary (Emp1): " + emp1.getMonthlySalary());
        System.out.println("Yearly Salary (Emp2): " + emp2.getMonthlySalary());
        System.out.println("Yearly Salary (Emp1): " + emp1.getYearlySalary());
        System.out.println("Yearly Salary (Emp2): " + emp2.getYearlySalary());

        emp1.giveRaise(10);
        emp2.giveRaise(10);

        System.out.println("Yearly Salary After Raise (Emp1): " + emp1.getYearlySalary());
        System.out.println("Yearly Salary After Raise (Emp2): " + emp2.getYearlySalary());
    }
}

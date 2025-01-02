import java.util.Scanner;
public class PropertyTax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------");

        System.out.print("Enter the actual value of a piece of the property: $");
        double actualValue = sc.nextDouble();

        System.out.print("Enter the tax rate per $100: $");
        double taxRate = sc.nextDouble();

        double assessedValue = actualValue * 0.6;
        double propertyTax = (taxRate / 100) * assessedValue;

        System.out.println("\nAssessed value: $" + assessedValue);
        System.out.println("Annual Property tax: $" + propertyTax);

        System.out.println("---------------------------------------------------------------");
    }
}

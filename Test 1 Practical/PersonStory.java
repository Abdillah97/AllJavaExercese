import java.util.Scanner;
public class PersonStory{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------------------");

        String name,city,college,proffesion,animal,petname;
        int age;

        System.out.print("What is your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your city name: ");
        city = sc.nextLine();

        System.out.print("Enter your college name: ");
        college = sc.nextLine();

        System.out.print("What is your proffesion: ");
        proffesion = sc.nextLine();

        System.out.print("What animal you have: ");
        animal = sc.nextLine();

        System.out.print("What is your pets name: ");
        petname = sc.nextLine();

        System.out.println("\nThere once a person named "+name+" who lived in "+city+
        ".At the age of "+age+","+name+" went to collage at "+college+".\n"+name+
        " graduated and works as "+proffesion+".Then "+name+" addopted a(n)"+animal+
        " named "+petname+",They lived happily ever after.");
        
        System.out.println("--------------------------------------------------------------------------------------");
    }
}

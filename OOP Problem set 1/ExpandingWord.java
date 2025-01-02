import java.util.Scanner;
public class ExpandingWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------");
        System.out.print("Enter any word: ");
        String word=sc.nextLine();

        String ExpandedWord="";

        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j <= i; j++){
                ExpandedWord += word.charAt(i);
            }
        }
        System.out.println("\nYour word is: "+word+"\nExpanded format: "+ExpandedWord);
        System.out.print("-----------------------------------------"); 
    }
}

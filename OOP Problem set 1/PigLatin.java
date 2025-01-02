import java.util.Scanner;
public class PigLatin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");

        System.out.print("Enter an English sentence: ");
        String sentence = sc.nextLine().toLowerCase();

        String[] vowels = {"a", "e", "i", "o", "u"};
        String latin = "";
        String[] words = sentence.split(" ");

        for(String word : words){
            boolean startsWithVowel = false;
            for(String vowel : vowels){
                if(String.valueOf(word.charAt(0)).equals(vowel)){
                    startsWithVowel = true;
                    break;
                }
            }

            if(startsWithVowel){
                latin += word + "hay ";
            }else{
                int index = -1;
                for(int i = 0; i < word.length(); i++){
                    for(String vowel : vowels){
                        if(String.valueOf(word.charAt(i)).equals(vowel)){
                            index = i;
                            break;
                        }
                    }
                    if(index != -1){
                        break;
                    }
                }
                if(index != -1){
                    latin += word.substring(index) + word.substring(0, index) + "ay ";
                }else{
                    latin += word + "ay ";
                }
            }
        }
        System.out.println("\nPIG LATIN: " + latin.trim());
        System.out.println("----------------------------------------------------------------");
    }
}

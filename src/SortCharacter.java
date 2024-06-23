import java.util.Arrays;
import java.util.Scanner;

public class SortCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input one line of word : ");
        String input = scanner.nextLine();

        StringBuilder vowel = new StringBuilder();
        StringBuilder consonant = new StringBuilder();

        String vowelList = "aiueo";

        for (char c: input.toLowerCase().toCharArray()){
            if (c == ' '){
                continue;
            }

            if (vowelList.indexOf(c) != -1){
                vowel.append(c);
            }else{
                consonant.append(c);
            }
        }

        char[] vowelArray = vowel.toString().toCharArray();

        Arrays.sort(vowelArray);

        String sortedVowel = new String(vowelArray);

        System.out.println("Vowel Character : ");
        System.out.println(sortedVowel);
        System.out.println("Consonant Character : ");
        System.out.println(consonant);
    }
}
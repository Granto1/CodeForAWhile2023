import java.util.Scanner;

public class Vowels {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String vowels = "AEIOUaeiou";
        int vowelCounter = 0;
        for (int x = 0; x < word.length(); x++) {
            char y = word.charAt(x);
            if (y == 'a' || y =='e' || y == 'o' || y =='u' || y =='i' || y =='A' || y == 'E' || y == 'O' || y =='I' || y =='U') {
                vowelCounter++;
            }
        }
        System.out.println(vowelCounter);
    }
}

import java.util.Scanner;
import java.util.StringTokenizer;

public class Peak {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int length = Integer.valueOf(input.nextLine());
        String temps = input.nextLine();
        StringTokenizer token = new StringTokenizer(temps, " ");
        int[] temperatures = new int[length];
        for (int x = 0; x < length; x++) {
            temperatures[x] = Integer.parseInt(token.nextToken());
        }
        int counter = 0;
        for (int x = 1; x < length - 1; x++) {
            if (temperatures[x] > temperatures[x-1] && temperatures[x] > temperatures[x + 1]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Flying {
    static int max_ref;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hills = input.nextLine();
        StringTokenizer tokens = new StringTokenizer(hills, " ");
        int[] hill = new int[tokens.countTokens()];
        int count = 0;
        while (tokens.hasMoreTokens()) {
            hill[count] = Integer.parseInt(tokens.nextToken());
            count++;
        }
        System.out.println(length(hill, hill.length));
    }
    public static int length(int[] hill, int len) {
       int[] tails = new int[len];
       int size = 0;
       for (int x : hill) {
           int i = 0, j = size;
           while (i != j) {
               int m = (i + j) / 2;
               if (tails[m] < x)
                   i = m + 1;
               else
                   j = m;
           }
           tails[i] = x;
           if (i == size) ++size;
       }
        return size;
    }
}

import java.util.*;

public class d {
    Set<Integer> a = new HashSet<Integer>();
    int counter = 0;
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    public static void main(String[] args) {

        Scanner kin = new Scanner(System.in);
        String len = kin.nextLine();
        StringTokenizer token = new StringTokenizer(len, "+");
        while (token.hasMoreTokens()) {
            numbers.add(Integer.valueOf(token.nextToken()));
        }

        String output = "";
        int[] number = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            output += numbers.get(i).toString();
            number[i] = numbers.get(i);
        }
        System.out.println(output);

        System.out.println(generateValue(number, number.length - 1, new ArrayList<Integer>()));
    }

    public static int generateValue(int[] numbers, int oper, ArrayList<Integer> stored) {
        if (oper == 0) {
            return stored.size();
        }
        int newUniqueCase = 0;
        //MAX CASE, NO VARIABILITY IN POSITION OF CONCAT
        if (oper == numbers.length - 1) {
            int returnable = 0;
            for (int x = 0; x < numbers.length; x++) {
                returnable += numbers[x];
            }
            stored.add(returnable);
            return (generateValue(numbers, oper - 1, stored));
        }
        else {
            


        }
        return (generateValue(numbers, oper - 1, stored));
    }
}
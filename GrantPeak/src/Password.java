import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Password {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        boolean hasChar = false, hasNumber = false;
        for (int x = 0; x < password.length(); x++) {
            if (Character.isDigit(password.charAt(x))) {
                hasNumber = true;
            }
            if (Character.isAlphabetic(password.charAt(x))) {
                hasChar = true;
            }
            if (hasNumber && hasChar) {
                break;
            }
        }
        if (password.length() >= 10 && hasChar && hasNumber) {
            System.out.println("Good");
        }else {
            System.out.println("Bad");
        }

    }
}

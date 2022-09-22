import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cardSign = in.nextLine();

        switch (cardSign){
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
            case "J":
            case "Q":
            case "K":
            case "A":
                System.out.println("yes");
                break;

            default:
                System.out.println("no");
                break;
        }

    }
}

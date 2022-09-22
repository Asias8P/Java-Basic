import java.util.Scanner;

public class IntDoubleOrString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Please choose a type: %n1-->int%n2-->double%n3-->string%n");
        int userChoice = Integer.parseInt(in.nextLine());

        switch (userChoice){
        case 1:
            System.out.println("Please enter an int");
            int numInt = Integer.parseInt(in.nextLine());
            System.out.println(numInt+1);
            break;
            case 2:
                System.out.println("Please enter a double");
                double numDouble= Double.parseDouble(in.nextLine());
                System.out.println(numDouble+1);
                break;
            case 3:
                System.out.println("Please enter a string");
                String word = in.nextLine();
                System.out.println(word+"*");
                break;
            default:
                System.out.println();
        }
    }
}

import java.util.Scanner;

public class ConcatData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String lastName = input.nextLine();
        String age = input.nextLine();
        String town = input.nextLine();

        System.out.println("You are "+ firstName+" "+lastName+","+ " a "+age+"-years old person from " + town+".");

    }
}

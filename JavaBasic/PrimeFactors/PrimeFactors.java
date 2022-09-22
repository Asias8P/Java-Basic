import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());


        for (int i = 2; i <= number; i++) {


            while (number % i == 0) {

                number/=i;
                System.out.println(i);


            }
        }
    }
}
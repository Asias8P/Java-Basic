import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        int sum = number*(number+1)/2;
        System.out.println(sum);
    }
}

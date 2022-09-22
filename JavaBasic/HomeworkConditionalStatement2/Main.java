import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();

        if (score>=1 && score <= 3) {
            System.out.println(score*10);
        }
      else if (score>=4 && score <= 6) {
            System.out.println(score*100);
        }

        else if (score>=7 && score <= 9) {
            System.out.println(score*1000);
        }
        else {
            System.out.println("Invalid score");
        }
    }
}

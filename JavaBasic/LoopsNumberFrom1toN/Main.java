import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;

        while (n > 0) {
            counter++;
            System.out.print(counter+" ");
          if  (counter==n){
              break;
          }

        }
    }
}

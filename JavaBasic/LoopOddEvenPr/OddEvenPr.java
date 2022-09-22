import java.util.Scanner;

public class OddEvenPr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int productEven = 1;
        int productOdd = 1;
        int number = 1;
        for (int i = 1; i <= N; i++) {
            number = Integer.parseInt(in.nextLine());
            if (i % 2 == 0) {
                productEven *= number;
            } else {
                productOdd *= number;
            }

        }
        if (productEven==productOdd){
            System.out.printf("yes %d",productOdd);
        }
        else {
            System.out.printf("no %d %d",productOdd,productEven);
        }

    }}

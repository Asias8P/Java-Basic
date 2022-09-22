import java.util.Scanner;

public class OddEvenProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());

        int evenProduct=1;
        int oddProduct=1;

        for(int i = 1; i<= N;i++){

            int number = Integer.parseInt(in.nextLine());


            if (i % 2==0){
                evenProduct*=number;
            }

            if (i % 2!=0){
                oddProduct*=number;

        }



        }
        if (oddProduct==evenProduct){
            System.out.printf("yes %d",oddProduct);
        }
        else {
            System.out.printf("no %d %d",oddProduct,evenProduct);
        }

    }
}

package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class specialNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());


        for (int i = 1; i <=n; i++) {
            int number= i;
            int sum=0;

            while (number>0){
            int lastDigit= number % 10;
            sum+=lastDigit;
            number=number/10;}

            if(sum == 5 ||sum == 7 ||sum == 11 ){

                System.out.printf("%d -> True",i);
            }

            else {
                System.out.printf("%d -> False",i);
            }




            System.out.println();


        }

    }
}

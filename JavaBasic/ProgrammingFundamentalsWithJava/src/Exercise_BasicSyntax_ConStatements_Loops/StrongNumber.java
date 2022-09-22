package Exercise_BasicSyntax_ConStatements_Loops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num= in.nextLine();
        int sum=0;
        int factoriel=1;
        int numAsInt= Integer.parseInt(num);
        for (int i = 0; i <num.length() ; i++) {
            char digit  = num.charAt(i);


            int digitAsNum=Integer.parseInt(""+digit);
            factoriel=1;
            for (int j = 1; j <=digitAsNum ; j++) {
                factoriel*=j;


            }
            sum+=factoriel;
        }


        if(sum==numAsInt){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}

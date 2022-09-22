package Exercise_BasicSyntax_ConStatements_Loops;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startNum= Integer.parseInt(in.nextLine());
        int endNum= Integer.parseInt(in.nextLine());
        int sum=0;

        for (int i = startNum; i <= endNum; i++) {
            System.out.print(i + " ");
               sum+=i;
        }
        System.out.println();
        System.out.println("Sum: "+sum);
    }
}

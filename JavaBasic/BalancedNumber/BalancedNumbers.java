import java.util.Scanner;

public class BalancedNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isBalanced=true;
        int sumAllNum = 0;
        int newInt=0;
        int n1;
        int n2;
        int n3;


       do{
           newInt= in.nextInt();
           n1= (int )newInt /100;
           n2= (int )newInt /10 % 10;
           n3= (int )newInt % 100 %10;

           if (n1+n3==n2){
               sumAllNum+=newInt;
           }

       }while (n1+n3==n2);


       isBalanced= (n1+n3==n2);

       if(!isBalanced){
           System.out.println(sumAllNum);
       }

                }

            }

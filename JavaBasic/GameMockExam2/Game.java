import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String[]input = in.nextLine().split("");
        int [] num = new int[input.length];

           for( int i= 0; i<input.length; i++){
           int a = Integer.parseInt(input[0]);
           int b = Integer.parseInt(input[1]);
           int c = Integer.parseInt(input[2]);

            int sum = a + b + c;
            int multiplication = a * b * c;
            int max = Math.max(sum, multiplication);
            int combination1 = a * b + c;
            int combination2 = a + b * c;

            int max1 = 0;

            if (combination1 > combination2) {
                max1 = combination1;
            }
            if (combination2 > combination1) {
                max1 = combination2;
            }
        //    int finalMax=Math.max(max,max1);


               if (max1>max){
                   System.out.println(max1);
                   break;
               }
               else {
                   System.out.println(max);
                   break;
               }

           }



        }
    }


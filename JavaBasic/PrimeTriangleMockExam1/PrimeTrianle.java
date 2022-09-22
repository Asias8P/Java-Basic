import java.util.Scanner;

public class PrimeTrianle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
       int count =0;

        for (int i = 1; i <= n; i++) {
            //if(i%2==0 && i%3==0 && i%5==0 && i!=2 && i!=3 && i!=5&& i!=9)continue;

            for (int k = 2; k <= i/2; k++) {
                if (i % k == 0) {
                    count++;
                    break;
                }}
//                if (!(k%2==0) || k==2 )
                    if (count == 0) {
                        System.out.print("1");
                    }

                    else {
                        System.out.print("0");

                }

          //  System.out.println();
            }



        }

    }

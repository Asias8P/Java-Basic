import java.util.Scanner;

public class PrimeN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        int i=2;


            for (int k=2;k<=N;k++){

                  while (N%k==0){
                      N/=k;
                      System.out.println(k);
                  }
            }


        }
    }


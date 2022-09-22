package ExamPBJava;

import java.util.Scanner;

public class Pins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int first=Integer.parseInt(in.nextLine());
        int second=Integer.parseInt(in.nextLine());
        int third=Integer.parseInt(in.nextLine());

        for (int i = 1; i <=first ; i++) {
            if(i % 2 == 0){
                for (int j = 2; j <=second ; j++) {
                    if(j==2 || j==3 || j==5 || j==7){

                        for (int k = 1; k <=third ; k++) {
                            if(k % 2==0){
                                System.out.printf("%d %d %d %n",i,j,k);
                            }

                        }
                    }

                }
            }

        }

    }
}

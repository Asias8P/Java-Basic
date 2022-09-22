import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int [] line1 = new int [size];

        for (int i = 0; i < line1.length; i++) {
            System.out.printf("Line1Arr[%d]",i);
            line1[i] = in.nextInt();}

            int [] line2= new int [size];

            for(int i=0;i<= line2.length-1;i++){
                System.out.printf("Line2Arr[%d]",i);
                line2[i]=in.nextInt();}



            if (Arrays.equals(line1,line2))
            {
                System.out.println("Arrays are equal");
        }
        else{
                System.out.println("Arrays are not equal");
            }

}
    }
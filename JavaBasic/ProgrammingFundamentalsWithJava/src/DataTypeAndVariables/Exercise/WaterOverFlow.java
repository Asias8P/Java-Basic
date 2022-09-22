package DataTypeAndVariables.Exercise;

import java.util.Scanner;

public class WaterOverFlow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nLines= Integer.parseInt(in.nextLine());

        int sum=0;
        for (int i = 1; i <=nLines ; i++) {
            int letresWater = Integer.parseInt(in.nextLine());
            sum+=letresWater;
            if(sum>255){
                System.out.println("Insufficient capacity!");
                sum-=letresWater;
            }

        }
        System.out.println(sum);

    }
}

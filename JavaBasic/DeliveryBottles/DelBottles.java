import java.util.Scanner;

public class DelBottles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int smallB= Integer.parseInt(in.nextLine());
        int bigB = Integer.parseInt(in.nextLine());
        int capacityTruck = Integer.parseInt(in.nextLine());
        int allB=smallB+bigB*5;
        int result =0;
           if(bigB*5==capacityTruck){
            System.out.printf("%d",result);
        }
        else if (smallB+bigB*5==capacityTruck || allB>capacityTruck){
            System.out.print(capacityTruck-bigB);
        }

        else {

            System.out.print("-1");
        }
    }
}

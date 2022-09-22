import java.util.Arrays;
import java.util.Scanner;

public class IsArrEquals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int [] arr1= new int[n];
        int [] arr2 = new int[n];

        for (int i= 0; i<arr1.length;i++ ){
            arr1[i]=Integer.parseInt(in.nextLine());}

        for (int i= 0; i<arr2.length;i++ ){
            arr2[i]=Integer.parseInt(in.nextLine());
            }
        boolean isEqual= Arrays.equals(arr1,arr2);
        if (isEqual){
            System.out.println("is Equal");}
        else {
            System.out.println("Not equal");
        }


    }
}

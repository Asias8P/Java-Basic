import java.util.Arrays;
import java.util.Scanner;

public class CombineList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] arr1 = in.nextLine().split(",");
        String [] arr2 = in.nextLine().split(",");
        String []combineArr=new String[arr1.length];

       for(int i=0; i<=arr1.length-1;i++){
          combineArr[i]=arr1[i]+","+arr2[i];


           }
        String joinedArr = String.join(",",combineArr);
        System.out.print(joinedArr);

        

       }

}





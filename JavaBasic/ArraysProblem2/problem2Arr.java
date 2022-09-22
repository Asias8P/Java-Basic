import java.util.Arrays;
import java.util.Scanner;

public class problem2Arr {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//       String [] arr= input.nextLine().split(" ");
//        int sum=0;
//        for (int i = 0; i <=arr.length-1; i++) {
//
//            int num = Integer.parseInt(arr[i]);
//            sum += num;
//        }
//        String form = String.join("+",arr);
//            System.out.printf("%s = %d",form,sum);


        Scanner input = new Scanner(System.in);
        String arr1= input.nextLine();
        String arr2= input.nextLine();
        char [] charArr1 = arr1.toCharArray();
       char [] charArr2 = arr2.toCharArray();
       boolean equalsArr = Arrays.equals(charArr1,charArr2);

       int sum1=0;
       for (int i=0;i<charArr1.length;i++){
          sum1 = sum1 + charArr1[i];}

       int sum2=0;
       for (int i =0;i< charArr2.length;i++){
           sum2 = sum2 + charArr2[i];}


       if (sum1>sum2) {

               System.out.println("second");
       }

           else if  (sum2>sum1){
                   System.out.println("first");

           }

           else{
           System.out.println("equals");
       }

}}
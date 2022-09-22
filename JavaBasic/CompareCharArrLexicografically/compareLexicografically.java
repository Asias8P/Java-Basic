import java.util.Scanner;

public class compareLexicografically {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ar1 = in.nextLine();
        String ar2 = in.nextLine();


        String [] arr1 = in.nextLine().split("");
        String [] arr2 = in.nextLine().split("");
        char [] arrChar1= ar1.toCharArray();
        char [] arrChar2= ar2.toCharArray();
        int sum1=0;
        int sum2=0;
      for (int i=0;i<arrChar1.length;i++){
         arrChar1[i]=ar1.charAt(i);
          sum1+=ar1.charAt(i);

      }
        for (int i=0;i<arrChar2.length;i++){
            arrChar2[i]=ar2.charAt(i);
            sum2+=ar2.charAt(i);
        }
         if(sum1<sum2){
             System.out.println("first");
         }

        if(sum1>sum2){
            System.out.println("second");
        }

        if(sum1==sum2){
            System.out.println("equal");
        }
    }
}

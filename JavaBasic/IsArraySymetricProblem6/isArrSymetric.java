import java.util.Scanner;

public class isArrSymetric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arrSize = Integer.parseInt(in.nextLine());
        int[] arr = new int[arrSize];

        for (int i = 0; i < arr.length; i++){
//        int num = in.nextInt();
        arr[i] = Integer.parseInt(in.nextLine());
    }
          boolean isSym = true;

        for(int i=0; i<arr.length / 2; i++){
        if (arr[i]!=arr[arrSize-i-1]){
          isSym = false;
          break;
        }

        }

           if (isSym)
           System.out.println("Yes");
           else
        System.out.println("No");


    }
}

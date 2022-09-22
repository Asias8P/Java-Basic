import java.util.Scanner;

public class IsArrSymetric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[]strArr = in.nextLine().split(" ");
        int[]numArr = new int[strArr.length];
         boolean issym = true;
        for (int i=0; i< numArr.length;i++){
            numArr[i]= Integer.parseInt(strArr[i]);
        }
        for (int i=0; i< numArr.length / 2;i++){
            if (numArr[i] != numArr[numArr.length-i-1]){
            issym=false;
            break;


        }


    }
        if(issym){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
}}

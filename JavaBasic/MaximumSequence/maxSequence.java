import java.util.Scanner;

public class maxSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strArr= in.nextLine().split(" ");
        int [] numArr = new int[strArr.length];
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int result=1;
        for (int i = 0; i< numArr.length-1;i++) {
            numArr[i]=Integer.parseInt(strArr[i]);}
        for (int i = 0; i< numArr.length-1;i++) {
            if (numArr[i]==numArr[i+1]){
            count++;}

           else if(numArr[i]!=numArr[i+1]){
               count=1;
           }

           if (count>result){
             result=count;}

        }
        System.out.println(result);

    }

}

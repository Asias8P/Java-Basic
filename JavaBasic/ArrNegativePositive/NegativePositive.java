import java.util.Scanner;

public class NegativePositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strArr = in.nextLine().split(" ");
        int [] numArr = new int[strArr.length];
        String resNeg ="";
        String zero = "";
        String pos = "";

        for (int k = 0; k< numArr.length;k++){
            numArr[k]=Integer.parseInt(strArr[k]);
        }

        for (int i = 0; i< numArr.length;i++){
            if (numArr[i]<0) {
               resNeg+= numArr[i]+" ";

            }}


            for (int j = 0; j< numArr.length;j++){
                if (numArr[j]==0) {
                    zero+= numArr[j]+" ";
                }}
                for (int p = 0; p< numArr.length;p++){
                    if (numArr[p]>0) {
                        pos+= numArr[p]+" ";
                    }}



        System.out.print(resNeg+zero+pos);

}}


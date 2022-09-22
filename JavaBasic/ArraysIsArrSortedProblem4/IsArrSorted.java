import java.util.Scanner;

public class IsArrSorted {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[]input = sc.nextLine().split(" ");
        int [] numArr = new int[input.length];

        for (int i= 0; i<numArr.length; i++){
            numArr[i]=Integer.parseInt(input[i]);
        }
        int counter = 0;
        for (int i =0;i<numArr.length-1; i++){
        if(numArr[i]<=numArr[i+1]){
            counter++;
            }}
             if (counter==numArr.length-1){
                 System.out.println("yes");
             }

        else {
            System.out.println("No");
        }


}}

package Arrays.Exercise;

import java.util.Scanner;

public class commonElement02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String [] firstArr = in.nextLine().split(" ");
        String [] secondArr = in.nextLine().split(" ");


        for (int i = 0; i < secondArr.length ; i++) {
            for (int j = 0; j < firstArr.length; j++) {
                if(secondArr[i].equals(firstArr[j])){
                    System.out.print(secondArr[i]+" ");
                }

            }

        }

    }
}

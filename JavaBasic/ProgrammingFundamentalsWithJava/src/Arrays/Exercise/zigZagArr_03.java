package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class zigZagArr_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());


            int [] firstArr = new int[n];
            int [] sectArr = new int[n];
            for (int j = 0; j <n ; j++) {
                int [] currentArr = Arrays
                        .stream(in.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                if(j % 2==0){
                   firstArr[j] =currentArr[0];
                   sectArr[j]=currentArr[1];
                }

               else {
                  firstArr[j]=currentArr[1];
                    sectArr[j]=currentArr[0];
                }

            }


        for (int firstElement:firstArr) {
            System.out.print(firstElement+" ");

        }
        System.out.println();
        for (int secondElement:sectArr) {
            System.out.print(secondElement+" ");

        }
    }}


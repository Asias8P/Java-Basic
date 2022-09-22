package Methods.Exercise;

import java.util.Scanner;

public class smallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNum=Integer.parseInt(in.nextLine());
        int secondNum=Integer.parseInt(in.nextLine());
        int thirdNum=Integer.parseInt(in.nextLine());
        printTheSmallestNum(firstNum,secondNum,thirdNum);
    }
    private static void printTheSmallestNum(int n1,int n2,int n3){
        int smaller=Math.min(n1,n2);
        int smallest=Math.min(smaller,n3);
        System.out.println(smallest);
    }
}

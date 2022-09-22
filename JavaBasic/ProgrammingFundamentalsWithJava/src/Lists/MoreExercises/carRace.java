package Lists.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class carRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] numbers= Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int middlePoint = numbers.length/2;

        double leftSum = 0;
        double rightSum = 0;

        for (int i = 0; i < middlePoint; i++) {
            if(numbers[i]==0){
                leftSum=leftSum*0.80;
            }
            else {
            leftSum+=numbers[i];
        }}

        for (int i = numbers.length-1; i >middlePoint ; i--) {
            if(numbers[i]==0){
                rightSum=rightSum*0.80;
            }
            else {
            rightSum+=numbers[i];
        }}

        if(rightSum<leftSum){
            System.out.printf("The winner is right with total time: %.1f ",rightSum);
        }
        else {
            System.out.printf("The winner is left with total time: %.1f ",leftSum);
        }
    }
}

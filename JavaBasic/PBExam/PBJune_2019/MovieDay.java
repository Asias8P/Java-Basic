package PBJune_2019;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalTime=Integer.parseInt(in.nextLine());
        int scenesNumber=Integer.parseInt(in.nextLine());
        int timeFor1Scene=Integer.parseInt(in.nextLine());
        int neededTimeforScenes=scenesNumber*timeFor1Scene;
        int preparation= totalTime*15/100;
        int totalNeeded=neededTimeforScenes+preparation;

        if(totalNeeded<totalTime){
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!",totalTime-totalNeeded);
        }
        else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.",totalNeeded-totalTime);
        }
    }
}

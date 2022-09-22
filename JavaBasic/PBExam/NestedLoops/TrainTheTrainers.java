package NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOjJourey=Integer.parseInt(in.nextLine());
        double avgTotal=0;
        double avg=0;
        int counter=0;

        String presentation= in.nextLine();
        while (!presentation.equals("Finish")){

            avg=0;
            for (int i = 1; i <=numOjJourey ; i++) {
                double mark= Double.parseDouble(in.nextLine());
                avg+=mark;
                avgTotal+=mark;
                counter++;
            }
            System.out.printf("%s - %.2f.%n",presentation,avg/numOjJourey);
            presentation= in.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.",avgTotal/counter);
    }
}

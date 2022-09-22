package ExamPBJava;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String player = in.nextLine();
        int counterGoals = 0;
        int goals = 0;
        boolean isHetTrik = false;
        int bestResult = Integer.MIN_VALUE;
        String bestPlayer = "";

        while (!player.equals("END")) {
            goals = Integer.parseInt(in.nextLine());
            counterGoals += goals;
            if (goals >= 10) {
                bestResult = goals;
                bestPlayer = player;
                isHetTrik=true;
                break;
            }
            if (goals >= 3) {
                isHetTrik = true;
            }
            if (bestResult < goals) {
                bestResult = goals;
                bestPlayer = player;
            }
            player = in.nextLine();
        }

        System.out.printf("%s is the best player!%n", bestPlayer);
        if (isHetTrik) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", bestResult);
        }
        else {
            System.out.printf("He has scored %d goals.",bestResult);
        }

    }
}

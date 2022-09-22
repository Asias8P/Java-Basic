package PBMarch_019;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String gamer1 = in.nextLine();
        String gamer2 = in.nextLine();
        String command = in.nextLine();
        int points1 = 0;
        int points2 = 0;
        int pointsWinner = 0;
        String winner = "";
        boolean isWarOfNumbers = false;
        while (!command.equals("End of game")) {
            int card1 = Integer.parseInt(command);
            int card2 = Integer.parseInt(in.nextLine());
            if (card1 > card2) {
                points1 += (card1 - card2);
            } else if (card2 > card1) {
                points2 += (card2 - card1);
            } else {
                isWarOfNumbers = true;
                System.out.println("Number wars!");
                command = in.nextLine();
                if (command.equals("End of game")) {
                    break;
                }
                card1 = Integer.parseInt(command);
                card2 = Integer.parseInt(in.nextLine());
                if (card1 > card2) {

                    winner = gamer1;
                    pointsWinner = points1;
                } else {
                    winner = gamer2;
                    pointsWinner = points2;
               }
                    break;

                }
                command = in.nextLine();
            }


            if (isWarOfNumbers) {

                System.out.printf("%s is winner with %d points%n", winner, pointsWinner);
            }


            if (command.equals("End of game")) {
                System.out.printf("%s has %d points%n", gamer1, points1);
                System.out.printf("%s has %d points", gamer2, points2);
            }

        }
    }

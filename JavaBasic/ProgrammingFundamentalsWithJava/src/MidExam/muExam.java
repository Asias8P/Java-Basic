package MidExam;

import java.util.Scanner;

public class muExam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] rooms = in.nextLine().split("\\|");

        int health = 100;
        int bitcoin = 0;
        boolean isKilled = false;
        for (int i = 0; i < rooms.length; i++) {
            String[] commandNumber = rooms[i].split(" ");
            String command = commandNumber[0];
            int number = Integer.parseInt(commandNumber[1]);

            if (command.equals("potion")) {
                int currentHealt = health;
                health = health + number;
                if (health > 100) {
                    health = 100;
                    number = 100 - currentHealt;
                }
                System.out.printf("You healed for %d hp.%n", number);
                System.out.printf("Current health: %d hp.%n", health);
            } else if (command.equals("chest")) {
                bitcoin = bitcoin + number;
                System.out.printf("You found %d bitcoins.%n", number);
            } else {
                health = health - number;

                if (health <= 0) {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", i + 1);
                    isKilled = true;
                } else {
                    System.out.printf("You slayed %s.%n", command);
                }
            }


            if (isKilled) {
                break;
            }

        }
        if (!isKilled) {

            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoin);
            System.out.printf("Health: %d%n", health);
        }

    }
}

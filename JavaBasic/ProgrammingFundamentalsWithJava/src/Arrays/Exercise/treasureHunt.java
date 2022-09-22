package Arrays.Exercise;

import java.util.Scanner;

public class treasureHunt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] initialLoot = in.nextLine().split("\\|");
        String command = in.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] command1 = command.split(" ");
            String firstEl = command1[0];


            switch (firstEl) {

                case "Loot":
                    for (int i = 1; i < command1.length; i++) {
                        boolean isElContained = false;
                        for (int j = 0; j < initialLoot.length; j++) {
                            if (command1[i].equals(initialLoot[j])) {
                                isElContained = true;
                                break;
                            }
                        }


                        if (!isElContained) {
                            String newLoot = command1[i] + " " + String.join(" ", initialLoot);
                            initialLoot = newLoot.split(" ");

                        }

                    }


                    break;
                case "Drop":

                    int position = Integer.parseInt(command1[1]);
                    if (position>=0 && position<= initialLoot.length-1){

                    String dropItem = initialLoot[position];

                    for (int i = position; i < initialLoot.length - 1; i++) {
                        initialLoot[i] = initialLoot[i + 1];

                    }
                    initialLoot[initialLoot.length - 1] = dropItem;}
                    else {
                        break;
                    }


                    break;
                case "Steal":
                    int stolenElements = Integer.parseInt(command1[1]);
                    if (stolenElements>=0 && stolenElements < initialLoot.length) {

                        for (int i = 0; i < stolenElements; i++) {
                            System.out.print(initialLoot[initialLoot.length - stolenElements + i]);
                            if (i != stolenElements - 1) {
                                System.out.print(", ");

                            }}
                            String[] tempChest = new String[initialLoot.length - stolenElements];
                            for (int j = 0; j < tempChest.length; j++) {
                                tempChest[j] = initialLoot[j];
                            }
                            initialLoot = tempChest;



                    } else if(stolenElements>=0){
                        for (int i = 0; i < initialLoot.length; i++) {
                            System.out.print(initialLoot[i]);
                            if (i != initialLoot.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        initialLoot = new String[0];
                    }
                    System.out.println();
                    break;
            }

        command = in.nextLine();
    }

    String counterLength = String.join("",initialLoot);
    double avg = counterLength.length() * 1.00 / initialLoot.length;
        if(initialLoot.length>0)

    {
        System.out.printf("Average treasure gain: %.2f pirate credits.", avg);
    }
        else

    {
        System.out.println("Failed treasure hunt.");

    }


}

}

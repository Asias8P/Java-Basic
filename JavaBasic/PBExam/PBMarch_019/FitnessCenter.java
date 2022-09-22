package PBMarch_019;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberVisitors= Integer.parseInt(in.nextLine());
        int counterBack=0;
        int counterChest=0;
        int counterLegs=0;
        int counterAbs=0;
        int counterShake=0;
        int counterPRBar=0;
        for (int i = 1; i <=numberVisitors ; i++) {
            String activity = in.nextLine();
            switch (activity){
                case"Back":{
                    counterBack++;
                    break;
                }
                case"Chest":{
                    counterChest++;
                    break;
                }
                case"Legs":{
                    counterLegs++;
                    break;
                }
                case"Abs":{
                    counterAbs++;
                    break;
                }
                case"Protein shake":{
                    counterShake++;
                    break;
                }
                case"Protein bar":{
                    counterPRBar++;
                    break;
                }

            }

        }
        double totalWorkouts= counterBack+counterChest+counterLegs+counterAbs;
        double totolConsumers= counterShake+counterPRBar;
        double percentWO=(totalWorkouts/numberVisitors)*100;
        double percentCons=(totolConsumers/numberVisitors)*100;

        System.out.printf("%d - back%n",counterBack);
        System.out.printf("%d - chest%n",counterChest);
        System.out.printf("%d - legs%n",counterLegs);
        System.out.printf("%d - abs%n",counterAbs);
        System.out.printf("%d - protein shake%n",counterShake);
        System.out.printf("%d - protein bar%n",counterPRBar);
        System.out.printf("%.2f%% - work out%n",percentWO);
        System.out.printf("%.2f%% - protein%n",percentCons);

    }
}

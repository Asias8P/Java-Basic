package PBJune_2019;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nameActor= in.nextLine();
        double startingPoints= Double.parseDouble(in.nextLine());
        double totalPoints=startingPoints;
        boolean nomination=false;
        int numberOfTheJourey= Integer.parseInt(in.nextLine());
        for (int i = 1; i <=numberOfTheJourey ; i++) {
            String nameOfAssessor= in.nextLine();
            double mark=Double.parseDouble(in.nextLine());
         totalPoints+=(nameOfAssessor.length()*mark)/2;
            if(totalPoints>1250.50){
                nomination=true;
                break;
            }




        }
        if(nomination){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",nameActor,totalPoints);
        }
        else {
            System.out.printf("Sorry, %s you need %.1f more!",nameActor,1250.50-totalPoints);
        }
    }
}

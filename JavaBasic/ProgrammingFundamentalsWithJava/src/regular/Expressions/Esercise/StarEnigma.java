package regular.Expressions.Esercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfMessages = Integer.parseInt(in.nextLine());

        List<String>attackPlanets= new ArrayList<>();
        List<String>destroyedPlanets= new ArrayList<>();
        Pattern pattern = Pattern.compile("@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>[0-9]+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<conunt>[0-9]+)");


        while (numberOfMessages!=0){
            String encryptedMessage = in.nextLine();
            int count  = 0;
            for (char symbol:encryptedMessage.toCharArray()) {

                switch (symbol){
                    case 's':
                    case 't':
                    case 'a':
                    case 'r':
                    case 'S':
                    case 'T':
                    case 'A':
                    case 'R':
                        count++;
                        break;
                }



            }

            StringBuilder decryptedMessage = new StringBuilder();
            for (char dectyptedSymbol:encryptedMessage.toCharArray()) {
               char deccyption = (char)(dectyptedSymbol-count);
                decryptedMessage.append(deccyption);
            }

            Matcher matcher = pattern.matcher(decryptedMessage);
            if(matcher.find()){
                String attackType = matcher.group("attackType");
                String planet = matcher.group("planet");

                if(attackType.equals("A")){
                    attackPlanets.add(planet);
                }
                else if(attackType.equals("D")){
                    destroyedPlanets.add(planet);
                }
            }


            numberOfMessages--;
        }

        Collections.sort(attackPlanets);
        Collections.sort(destroyedPlanets);
        System.out.println("Attacked planets: "+attackPlanets.size());
        for (String at:attackPlanets) {
            System.out.printf("-> %s%n",at);
        }
        System.out.println("Destroyed planets: "+destroyedPlanets.size());
        for (String dp:destroyedPlanets) {
            System.out.printf("-> %s%n ",dp);
        }
        }
    }


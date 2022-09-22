package Methods.Exercise;

import java.time.chrono.IsoChronology;
import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        if(passLettersCount(text) && isPassValid(text) && isAnySymbols(text)){
            System.out.println("Password is valid" );
        }

        else {
            if(!passLettersCount(text)){
                System.out.println("Password must be between 6 and 10 characters");
            }

            if(!isAnySymbols(text)){
                System.out.println("Password must consist only of letters and digits");
            }
            if(!isPassValid(text)){
                System.out.println("Password must have at least 2 digits");
            }
        }

    }
    private static boolean passLettersCount(String txt){
        int couNtsymbols=0;
        boolean isLettersNum=true;

        for (char symbols:txt.toCharArray())
        {
         couNtsymbols++;
        }
        if(couNtsymbols<6 && couNtsymbols>0){
            isLettersNum=false;

        }
        return isLettersNum;
    }

    public static boolean isPassValid(String txt){
        boolean isValid =true;
        int countInts= 0;
            for (char symbol:txt.toCharArray()) {
                if(symbol=='0'||symbol=='1'||symbol=='2'||symbol=='3'||symbol=='4'
                        ||symbol=='5'||symbol=='6'||symbol=='7'||symbol=='8'||symbol=='9'){
                    countInts++;
                }

            }
        if(countInts<2){
            isValid=false;

        }
            return isValid;
    }

    public static boolean isAnySymbols(String txt){
        boolean isSymolsCorrect = true;
        for (String symbol: txt.split("")) {
            if(!symbol.matches(".*[a-zA-Z].*") && !symbol.matches(".*[0-9].*")){
                isSymolsCorrect = false;

            }
        }
        return isSymolsCorrect;
    }
}

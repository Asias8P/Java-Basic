import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String label = in.nextLine();
        String rankStr = in.nextLine();
        int rank = Integer.parseInt(rankStr);
        boolean isEven= true;

        switch (rank){
            case 1:
            case 3:
            case 5:
            case 7:
                isEven=false;
                break;

            case 2:
            case 4:
            case 6:
            case 8:
                isEven=true;
                break;
        }

        switch (label.toLowerCase()){

            case "a":
            case "c":
            case "e":
            case "g":
                if(isEven){
                    System.out.println("light");
                }
                else if (!isEven){
                    System.out.println("dark");
                }
                break;
            case "b":
            case "d":
            case "f":
            case "h":
                if(isEven){
                    System.out.println("dark");
                }
                else if (!isEven){
                    System.out.println("light");
                }
                break;

                  }
            }
        }



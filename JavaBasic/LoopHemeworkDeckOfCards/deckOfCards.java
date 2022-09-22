import java.util.Locale;
import java.util.Scanner;

public class deckOfCards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String card = in.nextLine();
        int num=0;

        switch (card.toUpperCase()){
            case "2":
                num=2;
                break;
            case "3":
                num=3;
                break;
            case "4":
                num=4;
                break;
            case "5":
                num=5;
                break;
            case "6":
                num=6;
                break;
            case "7":
                num=7;
                break;
            case "8":
                num=8;
                break;
            case "9":
                num=9;
                break;
            case "10":
                num=10;
                break;
            case "J":
                num=11;
                break;
            case "K":
                num=12;
                break;
            case "Q":
                num=13;
                break;
            case "A":
                num=14;
                break;
            default:
                System.out.println("not a valid card");
        }

        for (int i=2;i<=num;i++) {

            if(i>=2 && i<=10){
            System.out.printf("%d of spades, ",i);
            System.out.printf("%d of clubs, ",i);
            System.out.printf("%d of hearts, ",i);
            System.out.printf("%d of diamonds%n",i);

        }
            if(i==11){

                System.out.print("J of spades, ");
                System.out.print("J of clubs, ");
                System.out.print("J f hearts, ");
                System.out.printf("J of diamonds%n");

            }
            if(i==12){

                System.out.print("Q of spades, ");
                System.out.print("Q of clubs, ");
                System.out.print("Q of hearts, ");
                System.out.printf("Q of diamonds%n");

            }
            if(i==13){

                System.out.print("K of spades, ");
                System.out.print("K of clubs, ");
                System.out.print("K of hearts, ");
                System.out.printf("K of diamonds%n");

            }
            if(i==14){

                System.out.print("A of spades, ");
                System.out.print("A of clubs, ");
                System.out.print("A f hearts, ");
                System.out.printf("A of diamonds%n");

            }
    }
}}

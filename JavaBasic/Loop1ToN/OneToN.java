import java.util.Locale;
import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
       String  card = in.nextLine();
       int n=0;

        switch (card.toUpperCase()){
            case "2":
                n=2;
                break;
            case "3":
                n=3;
                break;
            case "4":
                n=4;
                break;
            case "5":
                n=5;
                break;
            case "6":
                n=6;
                break;
            case "7":
                n=7;
                break;
            case "8":
                n=8;
                break;
            case "9":
                n=9;
                break;
            case "10":
                n=10;
                break;
            case "J":
                n=11;
                break;
            case "K":
                n=12;
                break;
            case "Q":
                n=13;
                break;
            case "A":
                n=14;
                break;
            default:
                System.out.println("not a valid card");
        }

                for (int i =2;i<=n;i++){
                    if(i<=10){
                System.out.printf("%d of spades, ",i);
               System.out.printf("%d of clubs, ",i);
               System.out.printf("%d of hearts, ",i);
               System.out.printf("%d of diamonds%n",i);}
                    else if(i==11){
                        System.out.print("J of spades, ");
                        System.out.print("J of clubs, ");
                        System.out.print("J of hearts, ");
                        System.out.println("J of diamonds");}

                    else if(i==12){
                        System.out.print("Q of spades, ");
                        System.out.print("Q of clubs, ");
                        System.out.print("Q of hearts, ");
                        System.out.println("Q of diamonds");}
                    else if(i==13){
                        System.out.print("K of spades, ");
                        System.out.print("K of clubs, ");
                        System.out.print("K of hearts, ");
                        System.out.println("K of diamonds");}
                    else if(i==14){
                        System.out.print("A of spades, ");
                        System.out.print("A of clubs, ");
                        System.out.print("A of hearts, ");
                        System.out.println("A of diamonds");}

                    }

                    }






        }




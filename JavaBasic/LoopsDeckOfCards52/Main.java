import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        //  int n= input.nextInt();



        int cardNum;


        for (cardNum = 0; cardNum <= 13; cardNum++) {

            String cardType=null;
            switch (cardType) {
                case "A":
                    cardNum = 1;
                    break;
                case "2":
                    cardNum = 2;
                    break;
                case "3":
                    cardNum = 3;
                    break;
                case "4":
                    cardNum = 4;
                    break;
                case "5":
                    cardNum = 5;
                    break;
                case "6":
                    cardNum = 6;
                    break;
                case "7":
                    cardNum = 7;
                    break;
                case "8":
                    cardNum = 8;
                    break;
                case "9":
                    cardNum = 9;
                    break;
                case "10":
                    cardNum = 10;
                    break;
                case "J":
                    cardNum = 11;
                    break;
                case "K":
                    cardNum = 12;
                    break;
                case "D":
                    cardNum = 13;
                    break;


            }
            System.out.printf("%s of spades, ", cardType);
            System.out.printf("%s of clubs, ", cardType);
            System.out.printf("%s of hearts, ", cardType);
            System.out.printf("%s of diamonds.%n ", cardType);
        }
    }

}
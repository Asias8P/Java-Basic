
import java.util.Scanner;


public class Main {
public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    String input = in.nextLine();
//    int messages = Integer.parseInt(input);
//    input = in.nextLine();
//    int minutes = Integer.parseInt(input);
//
//
//    int addMessages = 0;
//
//    if (messages>20) {
//        addMessages = messages-20;
//    }
//     int addMinutes=0;
//
//    if (minutes>60)
//    {
//        addMinutes = minutes-60;
//    }
//
//    double messagesPrice = addMessages*0.06;
//    double minutesPrice = addMinutes*0.10;
//    double tax = (messagesPrice+minutesPrice)*0.20;
//    double total = messagesPrice + minutesPrice + tax+12;
//
//    System.out.printf("%d additional messages for %.2f levas%n",addMessages,messagesPrice);
//    System.out.printf("%d additional minutes for %.2f levas%n", addMinutes, minutesPrice);
//    System.out.printf("%.2f additional taxes%n",tax);
//    System.out.printf("%.2f total bill", total);


        Scanner line1 = new Scanner(System.in);
        Scanner line2 = new Scanner(System.in);
        int messages = line1.nextInt();
        int minutes = line2.nextInt();

        double addNumOfMessages = messages-20;
        double addAmountForMessages = addNumOfMessages*0.06;

        double addNumOfMinutes = minutes-60;
        double addAmountForMinutes= addNumOfMinutes*0.10;

        double tax = (addAmountForMessages+addAmountForMinutes)*0.20;
        double total = tax+addAmountForMessages+addAmountForMinutes+12;


    if (messages>20 || minutes>60) {
                System.out.printf("%.0f additional messages for %.2f levas%n", addNumOfMessages, addAmountForMessages);
                System.out.printf("%.0f additional minutes for %.2f levas%n", addNumOfMinutes, addAmountForMinutes);
                System.out.printf("%.2f additional taxes%n",tax);
                System.out.printf("%.2f total bill", total);}

        else {
                System.out.println("0.00 additional messages for 0.00 levas");
        System.out.println("0.00 additional minutes for %0.00 levas");
        System.out.println("0.00 additional taxes%n");
        System.out.println("12 total bill");}


        }
        }
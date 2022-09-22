package Exercise_BasicSyntax_ConStatements_Loops;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Login {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String user= in.nextLine();
        String password= in.nextLine();
        int counter=0;
        boolean isBlocked=false;
        char pass=' ';
        String reversed="";

        for (int i = user.length()-1; i>=0 ; i--) {
             pass = user.charAt(i);
            reversed+=pass;
        }
       while (!password.equals(reversed)){
           counter++;

           if (counter==4){
               isBlocked=true;
               System.out.printf("User %s blocked!",user);
               break;
           }
           System.out.println("Incorrect password. Try again.");
           password= in.nextLine();
       }
       if(!isBlocked){
        System.out.printf("User %s logged in.",user);}

    }
}

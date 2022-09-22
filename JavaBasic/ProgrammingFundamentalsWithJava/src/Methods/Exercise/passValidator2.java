package Methods.Exercise;

import java.util.Scanner;

public class passValidator2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();
        boolean passLen=passLength(password);
        if(!passLen){
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean letDig = lettersDigits(password);
        if(!letDig){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean is2digits = atLeast2digits(password);

        if(!is2digits){
            System.out.println("Password must have at least 2 digits");
        }
 if(is2digits && letDig && passLen){
     System.out.println("Password is valid ");
 }
    }
private static boolean passLength(String pass){
        return pass.length()>=6 && pass.length()<=10;
}
private static boolean lettersDigits(String pass){
    for (char symbol:pass.toCharArray()) {
        if(!Character.isLetterOrDigit(symbol)){
            return false;
        }
    }
    return true;
}
  private static boolean atLeast2digits(String pass){
        int counterInts=0;
      for (char symbol: pass.toCharArray()) {
          if(Character.isDigit(symbol)){
              counterInts++;
          }

      }
      return counterInts>=2;
  }

}

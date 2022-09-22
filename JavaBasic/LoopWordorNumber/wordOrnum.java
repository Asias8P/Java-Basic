import java.util.Scanner;

public class wordOrnum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String input = in.nextLine();
        if (input.matches("[0-9]+") || input.startsWith("-")) {
            int number = Integer.parseInt(input);
            System.out.println(number+1);
        }
        else if(input.matches("[,-.]")){
            double numDouble = Double.parseDouble(input);
            System.out.println(numDouble+1);
        }
        else {
            for (int i= input.length()-1; i>=0;i--){
                String reversed ="";
                reversed+=input.charAt(i);
                System.out.print(reversed);
            }
        }

//        if (in.hasNextInt()){
//            int numInt=Integer.parseInt(in.nextLine());
//            System.out.println(numInt+1);
//        }
//        else if(in.hasNextDouble()){
//            double numDouble = Double.parseDouble(in.nextLine());
//            System.out.println(numDouble+1);
//        }
//        else {
//            String word = in.nextLine();
//            for(int i = word.length()-1; i>=0;i--){
//                String reversed= "";
//                reversed+=word.charAt(i);
//                System.out.print(reversed);
//            }
//        }


    }
}

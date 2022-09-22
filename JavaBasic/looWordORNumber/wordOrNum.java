import java.util.Scanner;

public class wordOrNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
         int sum= 0;
         String stringResult = "";
        for (int i =1; i<=N; i++){
            String input= in.nextLine();
            if(input.matches("[0-9]+") || input.startsWith("-")){
                int num = Integer.parseInt(input);
                sum+=num;
            }

            if (input.matches("[A-Za-z].*")){
             stringResult+=input.concat("_");
            }


        }
        if(stringResult.endsWith("_")){
            String stringResult2=stringResult.substring(0,stringResult.length()-1);
            System.out.println(stringResult2);
            System.out.println(sum);
            }

        else if (stringResult.equals("")){
            System.out.println("no words");
            System.out.println(sum);
        }

        else {
        System.out.println(stringResult);
            System.out.println(sum);
    }


    }
}

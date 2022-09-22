import java.util.Scanner;

public class FootballResult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String resultMatch1 = in.nextLine();
        String resultMatch2 = in.nextLine();
        String resultMatch3 = in.nextLine();
        int counterWin = 0;
        int counterlose = 0;
        int counterdrawn = 0;


//        for(int i=1;i<=3;i++){
//            String resultMatch1= in.nextLine();
//            char result11Char=resultMatch1.charAt(0);
//            char result12Char=resultMatch1.charAt(2);
//            int result11Int=Integer.parseInt(""+result11Char);
//            int result12Int=Integer.parseInt(""+result12Char);
//
//            if(result11Int>result12Int){
//                counterWin++;
//            }
//            else if(result11Int<result12Int){
//                counterlose++;
//            }
//            else {
//                counterdrawn++;
//            }
//        }


        char result11Char = resultMatch1.charAt(0);
        char result12Char = resultMatch1.charAt(2);
        int result11Int = Integer.parseInt("" + result11Char);
        int result12Int = Integer.parseInt("" + result12Char);

        char result21Char = resultMatch2.charAt(0);
        char result22Char = resultMatch2.charAt(2);
        int result21Int = Integer.parseInt("" + result21Char);
        int result22Int = Integer.parseInt("" + result22Char);

        char result31Char = resultMatch3.charAt(0);
        char result32Char = resultMatch3.charAt(2);
        int result31Int = Integer.parseInt("" + result31Char);
        int result32Int = Integer.parseInt("" + result32Char);

        if (result11Int > result12Int) {
            counterWin+=1;
        } else if (result11Int < result12Int) {
            counterlose+=1;
        } else {
            counterdrawn+=1;
        }

        if (result21Int > result22Int) {
            counterWin+=1;
        } else if (result21Int < result22Int) {
            counterlose+=1;
        } else {
            counterdrawn+=1;
        }

        if (result31Int > result32Int) {
            counterWin+=1;
        } else if (result31Int < result32Int) {
            counterlose+=1;
        } else {
            counterdrawn+=1;
        }


        System.out.printf("Team won %d games.%n",counterWin);
        System.out.printf("Team lost %d games.%n",counterlose);
        System.out.printf("Drawn games: %d",counterdrawn);

}
}





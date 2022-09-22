import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split("");

        int[] num = new int[input.length];
        int mainSum = 0;


        for (int i = 0; i < input.length; i++) {
            if (input[i].equals(".") || input[i].equals("-"))
                continue;
            num[i] = Integer.parseInt(input[i]);
            mainSum += num[i];
            if (mainSum > 9){
                mainSum = mainSum / 10 + mainSum % 10;
            }
        }
        System.out.println(mainSum);


    }


}



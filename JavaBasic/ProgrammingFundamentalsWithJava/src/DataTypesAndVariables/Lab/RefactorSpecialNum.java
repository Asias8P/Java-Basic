package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class RefactorSpecialNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        int endNum = Integer.parseInt(in.nextLine());

        for (int magicNum = 1; magicNum <= endNum; magicNum++) {
            int number = magicNum;
            int sum = 0;
            while (number > 0) {
                int lastDigit = number % 10;
                sum += lastDigit;
                number = number / 10;
            }
            boolean isMagicNum = (sum == 5) || (sum == 7) || (sum == 11);
            if (isMagicNum) {
                System.out.printf("%d -> True%n", magicNum);
            } else {
                System.out.printf("%d -> False%n", magicNum);
            }
        }

    }
}


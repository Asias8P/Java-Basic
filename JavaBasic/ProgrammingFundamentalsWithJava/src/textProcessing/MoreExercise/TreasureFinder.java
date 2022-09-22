package textProcessing.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String text = in.nextLine();

        while (!text.equals("find")) {
            StringBuilder decryptingCode = new StringBuilder();
            int index = 0;
            for (int i = 0; i < text.length(); i++) {
                if (index > numbers.length - 1) {
                    index = 0;
                }
                char letter = text.charAt(i);
                int result = (int) letter - numbers[index];
                char finalR=(char)result;
                index++;
                decryptingCode.append(finalR);
            }

            String typeCoordinates= decryptingCode.toString();
            String coordinates = typeCoordinates.substring(typeCoordinates.indexOf('<')+1,typeCoordinates.indexOf('>'));
            String type = typeCoordinates.substring(typeCoordinates.indexOf('&')+1,typeCoordinates.lastIndexOf('&'));
            System.out.printf("Found %s at %s%n",type,coordinates);

            text = in.nextLine();
        }


}}
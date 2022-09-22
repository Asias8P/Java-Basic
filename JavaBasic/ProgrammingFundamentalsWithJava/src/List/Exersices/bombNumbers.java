package List.Exersices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bombNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] bombAndPower = in.nextLine().split(" ");
        int bomb = Integer.parseInt(bombAndPower[0]);
        int power = Integer.parseInt(bombAndPower[1]);
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) == bomb) {
                int finalIndexToDel = i + power;
                int firstIndexToDel = i - power;
                int lastIndex = numbers.size() - 1;


                int left = Math.max(0, firstIndexToDel);
                int right = Math.min(finalIndexToDel, lastIndex);

                for (int j = right; j >= left; j--) {
                    numbers.remove(j);
                    i = 0;
                }
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);

        }

        System.out.println(sum);
    }
}

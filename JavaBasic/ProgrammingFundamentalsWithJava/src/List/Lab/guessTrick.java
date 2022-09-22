package List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class guessTrick {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer>numbers= Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum =0;
        int size = numbers.size();

        for (int i = 0; i <size/2; i++) {
            sum = numbers.get(i)+numbers.get(numbers.size()-1);
            numbers.set(i,sum);
            numbers.remove(numbers.size()-1);
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}

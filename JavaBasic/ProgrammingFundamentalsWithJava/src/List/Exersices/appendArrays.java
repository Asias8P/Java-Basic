package List.Exersices;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class appendArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       List<String> text = Arrays.stream(in.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(text);
        System.out.println(text.toString().replaceAll("[\\[\\],]","").replaceAll("\\s+"," ").trim());
    }
}

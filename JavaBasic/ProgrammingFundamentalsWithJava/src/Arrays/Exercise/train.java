package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int sum = 0;
        String a = "";
        String[] total = new String[n];
        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(in.nextLine());
            sum += people;
            a = Integer.toString(people);
            total[i] = a;

        }

        System.out.print(String.join(" ", total));
        System.out.println();
        System.out.println(sum);
    }
}

package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class townInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String town= in.nextLine();
        int population = Integer.parseInt(in.nextLine());
        double area = Double.parseDouble(in.nextLine());
                String result = String.format("Town %s has population of %d and area %.0f square km.",town,population,area);
        System.out.println(result);

    }
}

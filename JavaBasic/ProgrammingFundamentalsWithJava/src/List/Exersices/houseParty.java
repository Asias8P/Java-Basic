package List.Exersices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class houseParty {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        List<String> persons = new ArrayList<>();
        int commands = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= commands; i++) {
            String input = in.nextLine();
            String name = input.split(" ")[0];

            if (input.contains("is going!")) {
                if (persons.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    persons.add(name);
                }}


           else if (input.contains("is not going!")) {
                    if (persons.contains(name)) {
                        persons.remove(name);
                    } else {
                        System.out.printf("%s is not in the list!%n", name);
                    }


                }


            }

        System.out.printf(String.join("%n",persons));

        }

    }



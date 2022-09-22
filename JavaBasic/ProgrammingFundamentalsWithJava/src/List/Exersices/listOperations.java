package List.Exersices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = in.nextLine();

        while (!command.equals("End")) {
            List<String> operations = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            if (operations.contains("Add")) {
                int secondElement = Integer.parseInt(operations.get(1));
                numbers.add(secondElement);
            } else if (operations.contains("Insert")) {

                int secondElement = Integer.parseInt(operations.get(1));
                int index = Integer.parseInt(operations.get(2));
                if (!IsTheIndexOutside(index, numbers)) {
                    System.out.println("Invalid index");
                } else {

                    numbers.add(index, secondElement);
                }
            } else if (operations.contains("Remove")) {
                int secondElement = Integer.parseInt(operations.get(1));
                if (!IsTheIndexOutside(secondElement, numbers)) {
                    System.out.println("Invalid index");}
                else {
                numbers.remove(secondElement);}



            } else if (operations.contains("left")) {
                int numOfShistsLeft = Integer.parseInt(operations.get(2));

                for (int i = 1; i <= numOfShistsLeft; i++) {
                    int firstEl = numbers.get(0);
                    int lastIndex = numbers.size() - 1;
                    numbers.add(firstEl);
                    numbers.remove(0);
                }
            } else if (operations.contains("right")) {
                int numOfShistsRight = Integer.parseInt(operations.get(2));
                for (int i = 1; i <= numOfShistsRight; i++) {
                    int lastEl = numbers.get(numbers.size() - 1);
                    numbers.add(0, lastEl);
                    numbers.remove(numbers.size()-1);
                }
            }


            command = in.nextLine();
        }

        for (Integer num:numbers) {
            System.out.print(num+ " ");

        }
    }

    private static boolean IsTheIndexOutside(int index, List<Integer> numbers) {
        return index <= numbers.size() - 1 && index >= 0;
    }
}

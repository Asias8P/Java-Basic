package List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer>list = Arrays
                .stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = in.nextLine();



        while (!command.equals("end")){
            List<String> commandList = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String commandOne= commandList.get(0);
            int firstEl = Integer.parseInt(commandList.get(1));
            switch (commandOne){

                case "Add":
                    list.add(firstEl);
                    break;
                case "Remove":
                    list.remove(Integer.valueOf(firstEl));
                    break;
                case "RemoveAt":
                    list.remove(firstEl);
                    break;
                case "Insert":
                    int secEl = Integer.parseInt(commandList.get(2));
                    list.add(secEl,firstEl);
                    break;

            }

            command= in.nextLine();

        }

        System.out.println(list.toString().replaceAll("[\\[\\],]",""));
    }
}

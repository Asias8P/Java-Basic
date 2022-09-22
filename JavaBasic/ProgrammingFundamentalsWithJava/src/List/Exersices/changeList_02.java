package List.Exersices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer>numbers = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = in.nextLine();
        while (!command.equals("end")){
            String firstCommand = command.split(" ")[0];
            int element = Integer.parseInt(command.split(" ")[1]);


            if(firstCommand.equals("Delete")){
                numbers.removeAll(Arrays.asList(element));


            }
            else if(firstCommand.equals("Insert")){
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position,element);

            }



            command= in.nextLine();
        }
        for(Integer finalList: numbers){
            System.out.print(finalList+ " ");
        }
    }
}

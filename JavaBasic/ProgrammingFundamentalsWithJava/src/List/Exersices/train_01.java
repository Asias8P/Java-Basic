package List.Exersices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> wogons = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int capacityOfWagon = Integer.parseInt(in.nextLine());
        String input = in.nextLine();
        while (!input.equals("end")) {
            String firstElement=input.split(" ")[0];

            if(firstElement.equals("Add")){
                int secElement = Integer.parseInt(input.split(" ")[1]);
                wogons.add(secElement);
            }
            else{
                int passengers = Integer.parseInt(input.split(" ")[0]);
                for (int i = 0; i < wogons.size() ; i++) {
                    if(passengers+wogons.get(i)<=capacityOfWagon){
                        int addPassengers=passengers+wogons.get(i);
                        wogons.set(i,addPassengers);
                        break;
                    }

                }
            }



            input = in.nextLine();
        }

        System.out.println(wogons.toString().replaceAll("[\\[\\],]",""));
    }
}

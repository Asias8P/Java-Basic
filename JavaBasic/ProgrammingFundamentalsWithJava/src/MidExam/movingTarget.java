package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class movingTarget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> target = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = in.nextLine();



        while (!input.equals("End")) {
            String command1 = input.split(" ")[0];
           // command1 = input.split(" ")[0];
            int index = Integer.parseInt(input.split(" ")[1]);
            switch (command1) {
                case "Shoot":
                    int power = Integer.parseInt(input.split(" ")[2]);
                    if (isTheIndexExist(target, index)) {
                        int currentIn = target.get(index);
                        currentIn = currentIn - power;
                        if (currentIn <= 0) {
                            target.remove(index);
                        } else {
                            target.set(index, currentIn);
                        }
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(input.split(" ")[2]);
                    if (isTheIndexExist(target, index)) {
                        target.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(input.split(" ")[2]);
                    boolean isRadiusValid = (index + radius) <= target.size() - 1 && (index - radius) >= 0;
                    if (isTheIndexExist(target, index)) {
                        if (isRadiusValid) {
                            int rangeForRemove = radius * 2 + 1;
                            for (int i = 1; i <= rangeForRemove; i++) {
                                target.remove(index - radius);
                            }
                        }
                        else {
                            System.out.println("Strike missed!");
                        }

                    }
                    else {
                        System.out.println("Strike missed!");
                    }

                    break;
            }


            input = in.nextLine();
        }

//        for (int i = 0; i < target.size(); i++) {
//            if(i==target.size()-1){
//                System.out.print(target.get(i));
//            }
//            else {
//                System.out.print(target.get(i)+"|");
//            }
//
//        }

        List<String>result = new ArrayList<>();

        for (int item:target) {
            result.add(String.valueOf(item));}
            System.out.print(String.join("|",result));


    }

    private static boolean isTheIndexExist(List<Integer> target, int index) {
        return index >= 0 && index <= target.size() - 1;
    }
}

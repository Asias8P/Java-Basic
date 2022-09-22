package List.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class removeNegativesAndReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer>numberList= Arrays
                .stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numberList.removeIf(e -> e<0);
        Collections.reverse(numberList);
        if(numberList.isEmpty()){
            System.out.println("empty");
        }
        else {
            System.out.println(numberList.toString().replaceAll("[\\[\\],]",""));
        }


//        for (int i = 0; i <= numberList.size()-1; i++) {
//            if(numberList.get(i)<0){
//                numberList.remove(numberList.get(i));
//               i--;
//            }}
//            Collections.reverse(numberList);
//            if(numberList.isEmpty()){
//                System.out.println("empty");
//
//            }
//            else {
//                for (Integer numbers:numberList) {
//                    System.out.print(numbers+" ");
//
//                }
//            }


        }
    }


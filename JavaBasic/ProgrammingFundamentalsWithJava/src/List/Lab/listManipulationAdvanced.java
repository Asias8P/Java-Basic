package List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List <Integer> listOfNums = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = in.nextLine();

        while (!command.equals("end")){
            List<String> listOfStrings = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String firstElement = listOfStrings.get(0);

            switch (firstElement){

                case "Contains":
                    int secondElement = Integer.parseInt(listOfStrings.get(1));
                   boolean isInTHeList= listOfNums.contains(secondElement);
                   if(isInTHeList){
                       System.out.println("Yes");
                   }
                   else {
                       System.out.println("No such number");
                   }
                  //  System.out.println();
                    break;
                case "Print":
                    String secondEl = listOfStrings.get(1);
                    List<Integer>evenElements = new ArrayList<>();
                    if(secondEl.equals("even")){
                        for (int i = 0; i < listOfNums.size(); i++) {
                            if(listOfNums.get(i) % 2==0){
                                evenElements.add(listOfNums.get(i));
                                }}
                        System.out.println(evenElements.toString().replaceAll("[\\[\\],]",""));
                    }

                    else if (secondEl.equals("odd")){
                        List<Integer>oddElements = new ArrayList<>();
                        for (int i = 0; i < listOfNums.size(); i++) {
                            if(listOfNums.get(i) % 2!=0){
                                oddElements.add(listOfNums.get(i));
                            }

                        }
                        System.out.println(oddElements.toString().replaceAll("[\\[\\],]",""));
                    }
                   // System.out.println();
                    break;
                case "Get":
                    int sum =0;
                    for (int i = 0; i < listOfNums.size(); i++) {
                        sum+=listOfNums.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String firstEl = listOfStrings.get(1);
                    int secdEl = Integer.parseInt(listOfStrings.get(2));
                    List<Integer>greaterOrEven=new ArrayList<>();
                    if(firstEl.equals(">=")){
                        for (int i = 0; i <listOfNums.size() ; i++) {
                            if(listOfNums.get(i)>=secdEl){
                              greaterOrEven.add(listOfNums.get(i));
                            }
                        }
                        System.out.println(greaterOrEven.toString().replaceAll("[\\[\\],]",""));
                    }
                    else if(firstEl.equals("<")){
                        List<Integer>smaller=new ArrayList<>();
                        for (int i = 0; i <listOfNums.size() ; i++) {
                            if(listOfNums.get(i)<secdEl){
                               smaller.add(listOfNums.get(i));
                              }

                        }
                        System.out.println(smaller.toString().replaceAll("[\\[\\],]",""));
                    }

                    else if(firstEl.equals(">")){
                        List<Integer>greater=new ArrayList<>();
                        for (int i = 0; i <listOfNums.size() ; i++) {
                            if(listOfNums.get(i)>secdEl){
                                greater.add(listOfNums.get(i));
                               }

                        }
                        System.out.println(greater.toString().replaceAll("[\\[\\],]",""));

                    }
                    else if(firstEl.equals("<=")){
                        List<Integer>smallerOrEqual=new ArrayList<>();
                        for (int i = 0; i <listOfNums.size() ; i++) {
                            if(listOfNums.get(i)<=secdEl){
                                smallerOrEqual.add(listOfNums.get(i));
                                }

                        }
                        System.out.println(smallerOrEqual.toString().replaceAll("[\\[\\],]",""));
                    }
                   // System.out.println();
                    break;

            }

            command= in.nextLine();
        }


    }
}

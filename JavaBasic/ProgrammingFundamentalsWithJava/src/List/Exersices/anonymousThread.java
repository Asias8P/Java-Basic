package List.Exersices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class anonymousThread {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> text = Arrays.stream(in.nextLine().split(" ")).collect(Collectors.toList());
        String command = in.nextLine();

        while (!command.equals("3:1")) {
            String operation = command.split(" ")[0];
            ;
            switch (operation) {
                case "merge":
                    int startIndex = Integer.parseInt(command.split(" ")[1]);
                    int endIndex = Integer.parseInt(command.split(" ")[2]);
                    String concatEl = "";
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > text.size() - 1) {
                        endIndex = text.size() - 1;
                    }

                    boolean isIndexValid = startIndex<endIndex && startIndex< text.size()-1;
                    if(isIndexValid){
                    for (int i = startIndex; i <= endIndex; i++) {
                        concatEl += text.get(i);

                    }
                        for (int i = startIndex; i <=endIndex ; i++) {
                            text.remove(startIndex);

                        }
                     text.add(startIndex,concatEl);
                    }

                    break;

                case "divide":
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int partitions = Integer.parseInt(command.split(" ")[2]);
                    String elToDivide = text.get(index);//abcdef
                    text.remove(index);
                    int beginPartEl=0;
                    int parts = elToDivide.length() / partitions;
                    for (int i = 1; i < partitions; i++) {
                        text.add(index,elToDivide.substring(beginPartEl,beginPartEl+parts));
                      beginPartEl= beginPartEl+parts;
                        index++;
                    }
                    text.add(index,elToDivide.substring(beginPartEl));
                    break;
            }


            command = in.nextLine();
        }

        System.out.println(String.join(" ",text));


    }
}


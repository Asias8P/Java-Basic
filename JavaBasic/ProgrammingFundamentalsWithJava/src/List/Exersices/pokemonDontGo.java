package List.Exersices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pokemonDontGo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> listInt = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int index = Integer.parseInt(in.nextLine());
        int sumOfRemovedEl = 0;


        while (listInt.size() > 0) {

            int removedElement = 0;

            if (index < 0) {
                //remove the first element of the sequence, and COPY the last element to its place.
                removedElement=listInt.get(0);
                listInt.set(0,listInt.get(listInt.size() - 1));
                sumOfRemovedEl += removedElement;
            }

            else if (index > listInt.size() - 1) {
                removedElement=listInt.get(listInt.size() - 1);
                //remove the last element from the sequence, and COPY the first element to its place.
                listInt.set(listInt.size()-1,listInt.get(0));
                sumOfRemovedEl += removedElement;

            }
            else {

                removedElement = listInt.get(index);
                listInt.remove(index);
                sumOfRemovedEl += removedElement;
            if(listInt.size()<=0)
            break;}

            for (int i = 0; i < listInt.size(); i++) {

                int currentElement = listInt.get(i);

                if (currentElement <= removedElement) {
                    currentElement += removedElement;
                } else {
                    currentElement -= removedElement;
                }

                listInt.set(i, currentElement);

            }


            index = Integer.parseInt(in.nextLine());


        }
        System.out.println(sumOfRemovedEl);
    }
}

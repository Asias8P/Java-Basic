package List.Exersices;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class cardsGame_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> player1 = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> player2 = Arrays.stream(in.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (player1.size()!=0 && player2.size()!=0){
            if (player1.get(0) > player2.get(0)) {
                player1.add(player1.get(0));
                player1.add(player2.get(0));
                player1.remove(0);
                player2.remove(0);

            } else if (player1.get(0) < player2.get(0)) {
                player2.add(player2.get(0));
                player2.add(player1.get(0));
                player2.remove(0);
                player1.remove(0);

            } else if (player1.get(0).equals(player2.get(0))) {
                player2.remove(0);
                player1.remove(0);

            }

        }
        if(player1.isEmpty()){
            System.out.printf("Second player wins! Sum: %d",winnerSum(player2));
        }
        else {
            System.out.printf("First player wins! Sum: %d",winnerSum(player1));
        }

        }
        public static int winnerSum(List<Integer>player){
        int sum = 0;
            for (Integer cards:player) {
                sum+=cards;
            }
            return sum;
        }
    }

